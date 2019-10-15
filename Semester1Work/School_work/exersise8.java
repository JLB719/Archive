import java.util.Scanner;
public class exersise8 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a value");
    int value = in.nextInt();
    while (value < 0) {
      System.out.println("That number is not above 0 try again");
      Scanner in1 = new Scanner(System.in);
      System.out.println("Enter a value");
      int value1 = in1.nextInt();
      value = value1;
    }
    int result = value * value;
    System.out.println("The number squared is " + result);
  }
}
