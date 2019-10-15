import java.util.Scanner;
public class untitled {
  public static void main(String[] args) {
    int age1 = 0;
    int age2 = 0;
    int age3 = 0;
    int age4 = 0;
    int index = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter four ages.");
    age1 = in.nextInt();
    age2 = in.nextInt();
    age3 = in.nextInt();
    age4 = in.nextInt();
    System.out.println("Average age is: " + (age1+age2+age3+age4)/4.0f + ".");
  }
}
