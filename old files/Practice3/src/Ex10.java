import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
	int[][] print = {{0,1,4,5},{3,7,9,7},{1,8,2,1}};
	printArray(print);
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number in the form xy");
	int input = in.nextInt();
	in.close();
	int x = input/10;
	int y = input%10;
	if (x < print.length && y < print[0].length) {
	    System.out.print(print[x][y]);
	    print[x][y] = 0;
	    System.out.println();
	    printArray(print);
	} else {
	    System.out.println("Invalid x and y input");
	}
    }
    public static void printArray(int[][] print) {
	for (int i = 0; i < print.length; i++) {
	    for (int j = 0; j < print[i].length; j++) {
		System.out.print(print[i][j]);
	    }
	    System.out.println();
	}
    }
}
