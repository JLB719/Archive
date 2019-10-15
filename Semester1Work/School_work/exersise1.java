import java.util.Scanner;
public class exersise1{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number");
    int number = in.nextInt();
    if (number % 2 == 1) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }

  }
}
