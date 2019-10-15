import java.util.Scanner;
public class averages {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Type a number between 1 and 50");
    int number = in.nextInt();
    if (number < 1 || number > 50) {
      System.out.println("Number not in specified range");
    } else {
    int working1 = number*number;
    int working2 = working1*2;
    int answer = working2 -2;
    System.out.println(answer);
    }
  }
}
