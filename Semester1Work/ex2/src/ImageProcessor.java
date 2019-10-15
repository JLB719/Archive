package com.bham.pij.exercises.e2a;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;


/*
 * DO NOT IMPORT ANYTHING ELSE.
 */

public class ImageProcessor extends Application {

    // You can change these values if you want, to get a smaller or larger Window.
    private static final int STAGE_WIDTH = 400;
    private static final int STAGE_HEIGHT = 400;

    // These are the filters you must implement.
    private static final String[] filterTypes = {"IDENTITY","BLUR", "SHARPEN", "EMBOSS", "EDGE"};

    private Image image;
    private ImageView imgv;
    private VBox vbox;
    private Scene scene;
    private ArrayList<MenuItem> menuItems;
    private String currentFilename;

    public ImageProcessor() {

    }

    /*
     * You must complete the next four methods. You do not need to change
     * any other methods.
     */

    // You must complete this method.
    public Color[][] applyFilter(Color[][] pixels, float[][] filter) {
        for (int m = 1; m < pixels.length-1; m++) {
            for (int n = 1; n < pixels[1].length-1; n++) {
                int[] colorPartPixel = new int[3];
                colorPartPixel[0] = 0;
                colorPartPixel[1] = 1;
                colorPartPixel[2] = 2;

                for (int o = 0; o < colorPartPixel.length; o++) {
                    double currentFilterPixel = colorPartPixel[o];

                    double[] fitlerMatrixSum = new double[9];
                    double addMatrixRed = 0;
                    double addMatrixGreen = 0;
                    double addMatrixBlue = 0;

                    if (colorPartPixel[o] == colorPartPixel[0]) {
                        double[] filterMatrixSum = new double[9];
                        filterMatrixSum[0] = pixels[m - 1][n - 1].getRed() * filter[0][0];
                        filterMatrixSum[1] = pixels[m-1][n].getRed() * filter[0][1];
                        filterMatrixSum[2] = pixels[m - 1][n + 1].getRed() * filter[0][2];
                        filterMatrixSum[3] = pixels[m][n-1].getRed() * filter[1][0];
                        filterMatrixSum[4] = pixels[m][n].getRed() * filter[1][1];
                        filterMatrixSum[5] = pixels[m][n+1].getRed() * filter[1][2];
                        filterMatrixSum[6] = pixels[m+1][n-1].getRed() * filter[2][0];
                        filterMatrixSum[7] = pixels[m+1][n].getRed() * filter[2][1];
                        filterMatrixSum[8] = pixels[m+1][n+1].getRed() * filter[2][2];

                        for (int p = 0; p < filterMatrixSum.length; p++) {
                            addMatrixRed = addMatrixRed + filterMatrixSum[p];
                        }

                        if (addMatrixRed > 1) {
                            addMatrixRed = 1;
                        } else if (addMatrixRed < 0) {
                            addMatrixRed = 0;
                        }
                    }

                    if (colorPartPixel[o] == colorPartPixel[1]) {
                        double[] filterMatrixSum = new double[9];
                        filterMatrixSum[0] = pixels[m - 1][n - 1].getGreen() * filter[0][0];
                        filterMatrixSum[1] = pixels[m-1][n].getGreen() * filter[0][1];
                        filterMatrixSum[2] = pixels[m - 1][n + 1].getGreen() * filter[0][2];
                        filterMatrixSum[3] = pixels[m][n-1].getGreen() * filter[1][0];
                        filterMatrixSum[4] = pixels[m][n].getGreen() * filter[1][1];
                        filterMatrixSum[5] = pixels[m][n+1].getGreen() * filter[1][2];
                        filterMatrixSum[6] = pixels[m+1][n-1].getGreen() * filter[2][0];
                        filterMatrixSum[7] = pixels[m+1][n].getGreen() * filter[2][1];
                        filterMatrixSum[8] = pixels[m+1][n+1].getGreen() * filter[2][2];

                        for (int p = 0; p < filterMatrixSum.length; p++) {
                            addMatrixGreen = addMatrixGreen + filterMatrixSum[p];
                        }

                        if (addMatrixGreen > 1) {
                            addMatrixGreen = 1;
                        } else if (addMatrixGreen < 0) {
                            addMatrixGreen = 0;
                        }
                    }

                    if (colorPartPixel[o] == colorPartPixel[2]) {
                        double[] filterMatrixSum = new double[9];
                        filterMatrixSum[0] = pixels[m - 1][n - 1].getBlue() * filter[0][0];
                        filterMatrixSum[1] = pixels[m-1][n].getBlue() * filter[0][1];
                        filterMatrixSum[2] = pixels[m - 1][n + 1].getBlue() * filter[0][2];
                        filterMatrixSum[3] = pixels[m][n-1].getBlue() * filter[1][0];
                        filterMatrixSum[4] = pixels[m][n].getBlue() * filter[1][1];
                        filterMatrixSum[5] = pixels[m][n+1].getBlue() * filter[1][2];
                        filterMatrixSum[6] = pixels[m+1][n-1].getBlue() * filter[2][0];
                        filterMatrixSum[7] = pixels[m+1][n].getBlue() * filter[2][1];
                        filterMatrixSum[8] = pixels[m+1][n+1].getBlue() * filter[2][2];

                        for (int p = 0; p < filterMatrixSum.length; p++) {
                            addMatrixBlue = addMatrixBlue + filterMatrixSum[p];
                        }

                        if (addMatrixBlue > 1) {
                            addMatrixBlue = 1;
                        } else if (addMatrixBlue < 0) {
                                addMatrixBlue = 0;
                        }
                    }
                }
                pixels[m][n] = new Color(colorPartPixel[0], colorPartPixel[1], colorPartPixel[2], 1.0);
            }
        }
        return null;
    }

    // You must complete this method.
    public float[][] createFilter(String filterType) {
        if (filterType.equals("IDENTITY")) {
            float[][] colorArray = {{0,0,0},{0,1,0},{0,0,0}};
        }

        if (filterType.equals("BLUR")) {
            float[][] colorArray = {{0.0625f,0.125f,0.0625f},{0.135f,0.25f,0.125f},{0.0625f,0.125f,0.0625f}};
        }

        if (filterType.equals("SHARPEN")) {
            float[][] colorArray = {{0,-1,0},{-1,5,-1},{0,-1,0}};
        }
        if (filterType.equals("EMBOSS")) {
            float[][] colorArray = {{-2,-1,0},{-1,0,1},{0,1,2}};
        }

        if (filterType.equals("EDGE")) {
            float[][] colorArray = {{-1,-1,-1},{-1,8,-1},{-1,-1,-1}};
        }

        return null;
    }

    // You must complete this method.
    public Color[][] applySepia(Color[][] pixels) {
        for(int i = 0; i < pixels.length; i++) {
            for (int j = 0; j <pixels[0].length; j++) {
                Color currentPixelSepia = pixels[i][j];

                double redPixelOriginal = currentPixelSepia.getRed();
                double greenPixelOriginal = currentPixelSepia.getGreen();
                double bluePixelOriginal = currentPixelSepia.getBlue();

                double redPixelNew = (redPixelOriginal * 0.393) + (greenPixelOriginal * 0.769) + (bluePixelOriginal * 0.189);
                double greenPixelNew = (redPixelOriginal * 0.349) + (greenPixelOriginal * 0.686) + (bluePixelOriginal * 0.168);
                double bluePixelNew = (redPixelOriginal * 0.272) + (greenPixelOriginal * 0.534) + (bluePixelOriginal * 0.131);

                if (redPixelNew > 1) {
                    redPixelNew = 1;
                } else if (redPixelNew < 0) {
                    redPixelNew = 0;
                }

                if (greenPixelNew > 1) {
                    greenPixelNew = 1;
                } else if (greenPixelNew < 0) {
                    greenPixelNew = 0;
                }

                if (bluePixelNew > 1) {
                    bluePixelNew = 1;
                } else if (bluePixelNew < 0) {
                    bluePixelNew = 0;
                }

                pixels[i][j] = new Color(redPixelNew, greenPixelNew, bluePixelNew, 1.0);
            }
        }
        return null;
    }

    // You must complete this method.
    public Color[][] applyGreyscale(Color[][] pixels) {
        for(int k = 0; k < pixels.length; k++) {
            for(int l = 0; l < pixels[0].length; l++) {
                Color currentPixelGreyscale = pixels[k][l];

                double originalPixelRed = currentPixelGreyscale.getRed();
                double originalPixelGreen = currentPixelGreyscale.getGreen();
                double originalPixelBlue = currentPixelGreyscale.getBlue();

                double averagePixel = ((originalPixelRed + originalPixelGreen + originalPixelBlue)/3);

                double newPixelRed = averagePixel;
                double newPixelGreen = averagePixel;
                double newPixelBlue = averagePixel;

                pixels[k][l] = new Color(newPixelRed, newPixelGreen, newPixelBlue, 1.0);
            }
        }
        return null;
    }

    /*
     *
     * You can ignore the methods below.
     *
     */

    public void filterImage(String filterType) {

        Color[][] pixels = getPixelDataExtended();

        float[][] filter = createFilter(filterType);

        Color[][] filteredImage = applyFilter(pixels, filter);

        WritableImage wimg = new WritableImage(image.getPixelReader(), (int) image.getWidth(), (int) image.getHeight());

        PixelWriter pw = wimg.getPixelWriter();

        for (int i = 0; i < wimg.getHeight(); i++) {
            for (int j = 0; j < wimg.getWidth(); j++) {
                pw.setColor(i, j, filteredImage[i][j]);
            }
        }

        File newFile = new File("filtered_" + filterType + "_" + this.currentFilename);

        try {
            ImageIO.write(SwingFXUtils.fromFXImage(wimg, null), "png", newFile);
        } catch (Exception s) {
        }

        initialiseVBox(false);

        image = wimg;
        imgv = new ImageView(wimg);
        vbox.getChildren().add(imgv);
    }

    private void sepia() {

        Color[][] pixels = getPixelData();

        Color[][] newPixels = applySepia(pixels);

        WritableImage wimg = new WritableImage(image.getPixelReader(), (int) image.getWidth(), (int) image.getHeight());

        PixelWriter pw = wimg.getPixelWriter();

        for (int i = 0; i < wimg.getHeight(); i++) {
            for (int j = 0; j < wimg.getWidth(); j++) {
                pw.setColor(i, j, newPixels[i][j]);
            }
        }

        File newFile = new File("filtered_SEPIA_" + this.currentFilename);

        try {
            ImageIO.write(SwingFXUtils.fromFXImage(wimg, null), "png", newFile);
        } catch (Exception s) {
        }

        initialiseVBox(false);

        image = wimg;
        imgv = new ImageView(wimg);
        vbox.getChildren().add(imgv);
    }

    private void greyscale() {
        Color[][] pixels = getPixelData();

        Color[][] newPixels = applyGreyscale(pixels);

        WritableImage wimg = new WritableImage(image.getPixelReader(), (int) image.getWidth(), (int) image.getHeight());

        PixelWriter pw = wimg.getPixelWriter();

        for (int i = 0; i < wimg.getHeight(); i++) {
            for (int j = 0; j < wimg.getWidth(); j++) {
                pw.setColor(i, j, newPixels[i][j]);
            }
        }

        File newFile = new File("filtered_GREYSCALE_" + this.currentFilename);

        try {
            ImageIO.write(SwingFXUtils.fromFXImage(wimg, null), "png", newFile);
        } catch (Exception s) {
        }

        initialiseVBox(false);

        image = wimg;
        imgv = new ImageView(wimg);
        vbox.getChildren().add(imgv);

    }

    private Color[][] getPixelData() {
        PixelReader pr = image.getPixelReader();
        Color[][] pixels = new Color[(int) image.getWidth()][(int) image.getHeight()];
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                pixels[i][j] = pr.getColor(i, j);
            }
        }

        return pixels;
    }

    private Color[][] getPixelDataExtended() {
        PixelReader pr = image.getPixelReader();
        Color[][] pixels = new Color[(int) image.getWidth() + 2][(int) image.getHeight() + 2];

        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels.length; j++) {
                pixels[i][j] = new Color(1.0, 1.0, 1.0, 1.0);
            }
        }

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                pixels[i + 1][j + 1] = pr.getColor(i, j);
            }
        }

        return pixels;
    }

    private void initialiseStage(Stage stage) {
        stage.setTitle("Image Processor");
        scene = new Scene(new VBox(), STAGE_WIDTH, STAGE_HEIGHT);
        scene.setFill(Color.OLDLACE);
    }

    @Override
    public void start(Stage stage) {

        initialiseStage(stage);

        initialiseVBox(true);

        createMenuItems();

        enableMenuItem("open");

        createStage(stage);
    }

    private void createStage(Stage stage) {

        Menu menuFile = new Menu("File");

        MenuItem open = getMenuItem("open");

        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Open Image File");
                File file = fileChooser.showOpenDialog(stage);
                if (file != null) {
                    enableAllMenuItems();
                    disableMenuItem("open");
                    openFile(file);
                }
            }
        });

        menuFile.getItems().add(open);

        MenuItem close = getMenuItem("close");

        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                disableMenuItem("close");
                closeFile();
            }
        });

        menuFile.getItems().add(close);

        Menu menuTools = new Menu("Tools");

        MenuItem greyscale = getMenuItem("greyscale");

        greyscale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                greyscale();
            }
        });

        menuTools.getItems().add(greyscale);

        MenuItem blur = getMenuItem("blur");

        blur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                filterImage("BLUR");
            }
        });

        menuTools.getItems().add(blur);

        MenuItem sharpen = getMenuItem("sharpen");

        sharpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                filterImage("SHARPEN");
            }
        });

        menuTools.getItems().add(sharpen);

        MenuItem edge = getMenuItem("edge");

        edge.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                filterImage("EDGE");
            }
        });

        menuTools.getItems().add(edge);

        MenuItem sepia = getMenuItem("sepia");

        sepia.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                sepia();
            }
        });

        menuTools.getItems().add(sepia);

        MenuItem emboss = getMenuItem("emboss");

        emboss.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                filterImage("EMBOSS");
            }
        });

        menuTools.getItems().add(emboss);

        MenuItem identity = getMenuItem("identity");

        identity.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                filterImage("IDENTITY");
            }
        });

        menuTools.getItems().add(identity);

        MenuItem reset = getMenuItem("reset");

        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                reset();
            }
        });

        menuTools.getItems().add(reset);

        MenuBar menuBar = new MenuBar();

        menuBar.getMenus().addAll(menuFile, menuTools);

        ((VBox) scene.getRoot()).getChildren().addAll(menuBar, vbox);

        stage.setScene(scene);

        stage.show();
    }

    protected void reset() {
        initialiseVBox(false);
        openFile(new File(currentFilename));
    }

    private void initialiseVBox(boolean create) {

        final int LEFT = 10;
        final int RIGHT = 10;
        final int TOP = 10;
        final int BOTTOM = 10;


        if (create) {
            vbox = new VBox();
        }
        vbox.getChildren().clear();
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(LEFT,TOP,RIGHT,BOTTOM));
    }

    private void createMenuItems() {
        menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem("Open"));
        menuItems.add(new MenuItem("Close"));
        menuItems.add(new MenuItem("Greyscale"));
        menuItems.add(new MenuItem("Blur"));
        menuItems.add(new MenuItem("Sharpen"));
        menuItems.add(new MenuItem("Sepia"));
        menuItems.add(new MenuItem("Emboss"));
        menuItems.add(new MenuItem("Edge"));
        menuItems.add(new MenuItem("Identity"));
        menuItems.add(new MenuItem("Reset"));
        disableAllMenuItems();
    }

    private void disableAllMenuItems() {
        for (MenuItem m: menuItems) {
            m.setDisable(true);
        }
    }

    private void enableAllMenuItems() {
        for (MenuItem m: menuItems) {
            m.setDisable(false);
        }
    }

    private void disableMenuItem(String item) {
        for (MenuItem m: menuItems) {
            if (m.getText().equalsIgnoreCase(item)) {
                m.setDisable(true);
            }
        }
    }

    private void enableMenuItem(String item) {
        for (MenuItem m: menuItems) {
            if (m.getText().equalsIgnoreCase(item)) {
                m.setDisable(false);
            }
        }
    }

    private MenuItem getMenuItem(String name) {
        for (MenuItem m: menuItems) {
            if (m.getText().equalsIgnoreCase(name)) {
                return m;
            }
        }

        return null;
    }

    private void closeFile() {
        enableMenuItem("open");
        initialiseVBox(false);
    }

    private void openFile(File file) {

        image = new Image("file:" + file.getPath());

        if (image.getWidth() != image.getHeight()) {
            Alert alert = new Alert(AlertType.ERROR, "Image is not square.", ButtonType.OK);
            alert.showAndWait();
            return;
        }

        imgv = new ImageView();
        imgv.setImage(image);
        vbox.getChildren().add(imgv);
        currentFilename = file.getName();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
