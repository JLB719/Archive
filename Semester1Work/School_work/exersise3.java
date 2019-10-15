import java.util.Scanner;
  public class exersise3 {
    public static void main(String[] args) {
      Scanner in1 = new Scanner(System.in);
      System.out.println("Enter the first number");
      int number1 = in1.nextInt();
      Scanner in2 = new Scanner(System.in);
      System.out.println("Enter second number");
      int number2 = in2.nextInt();
      Scanner in3 = new Scanner(System.in);
      System.out.println("Enter third number");
      int number3 = in3.nextInt();
      if (number1 < 0 || number2 < 0 || number3 <0) {
        System.out.println("At least one of the numbers is negative and this code does not permit that");
      } else if (number1 > number2 && number1 > number3) {
        System.out.println("The first number you entered of " + number1 + " is the highest");
      } else if (number2 > number1 && number2 > number3) {
        System.out.println("The second number you entered of " + number2 + " is the highest");
      } else if (number3 > number1 && number3 > number2) {
        System.out.println("The third number you entered of " + number3 + " is the highest");
      } else if (number1 == number2 && number1 == number2 && number2 == number3) {
      System.out.println("The numbers are the same");
      }

    }
  }
