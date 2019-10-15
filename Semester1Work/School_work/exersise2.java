import java.util.Scanner;
public class exersise2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number");
    int number1 = in.nextInt();
    Scanner in1 = new Scanner(System.in);
    System.out.println("Enter second number");
    int number2 = in1.nextInt();
    System.out.println(number1);
    System.out.println(number2);
    if (number1 < number2) {
      System.out.println(number2 + " is greater than " + number1);
    } else if (number1 > number2) {
      System.out.println(number2 + " is less than " + number1);
    } else {
      System.out.println("numbers are the same");
    }
  }
}
