import java.util.Scanner;
public class EX9 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer");
	int gridSize = in.nextInt();
	in.close();
	int[][] print = new int[gridSize][gridSize];
	for (int i = 0; i < gridSize; i++) {
	    for (int j = 0; j < gridSize; j++) {
		print[i][j] = (i+1) * (j+1);
	    }
	}
	printArray(print);

    }
    public static void printArray(int[][] print) {
	for (int i = 0; i < print.length; i++) {
	    for (int j = 0; j < print[i].length; j++) {
		System.out.print(print[i][j] + " ");
	    }
	    System.out.println();
	}
    }

}
