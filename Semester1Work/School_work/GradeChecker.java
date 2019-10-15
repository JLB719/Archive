import java.util.Scanner;
public class GradeChecker{
  public static void main(String[] args) {
    Scanner grade = new Scanner(System.in);
    System.out.println("Enter the grade");
    int grade1 = grade.nextInt();
    if (grade1 < 40 && grade1 >= 0){
      System.out.println("Fail");
    } else if (grade1 >= 40 && grade1 <=100){
      System.out.println("Pass");
    } else {
      System.out.println("Invalid input");
    }

  }
}
