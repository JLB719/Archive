import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = in.nextInt();
        if (input < 1) {
            System.out.println("Error");
        } else if (input % 2 == 1) {
            System.out.println("Odd");
        } else if (input % 2 == 0) {
            System.out.println("Even");
        }
    }
}
