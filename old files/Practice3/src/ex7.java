import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a load of integers");
	String input = in.nextLine();
	in.close();
	String[] stringStore = input.split(" ");
	int[] numbers = new int[stringStore.length];
	for (int i = 0; i < stringStore.length; i++) {
	    numbers[i] = Integer.parseInt(stringStore[i]);
	}
    }
}
