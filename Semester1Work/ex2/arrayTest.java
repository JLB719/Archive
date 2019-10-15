public class arrayTest {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7, 8, 9}};
        //System.out.print(arr[1][2]);
        //System.out.print(arr);
        int[] test = new int[5];
        test[0] = 2;
        test[1] = 5;
        test[2] = 7;
        test[3] = 8;
        test[4] = 9;
        for (int i = 0; i < test.length; i++) {
            int square = (test[i] * test[i]);
            test[i] = square;
        }
        System.out.print("1st value is " + test[0]);
        System.out.print("2nd value is " + test[1]);
        System.out.print("3rd value is " + test[2]);
        System.out.print("4th value is " + test[3]);
        System.out.print("5th value is " + test[4]);
        int[][] aarray = new int[100][56];
        aarray[0][0] = 1;
        aarray[0][1] = 2;
        aarray[0][2] = 3;
        aarray[1][0] = 4;
        aarray[1][1] = 5;
        aarray[1][2] = 6;
        aarray[2][0] = 7;
        aarray[2][1] = 8;
        aarray[2][2] = 9;
        //System.out.print(a);
        //System.out.print(aarray.length + "%n");
        //System.out.print(aarray[0].length);
        /*
        for (int i = 0; i < 3; i++) {
            int add = aarray[0][i] + 3;
            System.out.print(add);
        }
            for (int k = 0; k < 3; k++) {
                int mutlipy = aarray[0][k] *3;
                System.out.print(mutlipy + " ,");
            }
        for (int l = 0; l < 3; l++) {
            int subtract = aarray[0][l] - 1;
            System.out.print(subtract);
        }
        */



    }
}
