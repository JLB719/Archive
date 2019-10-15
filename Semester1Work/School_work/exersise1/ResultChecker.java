package com.bham.pij.exercises.e1c;
import java.util.Scanner;
public class ResultChecker {
  public static void main(String[] args) {
    int grade1 = 0;
    int grade2 = 0;
    int grade3 = 0;
    int grade4 = 0;
    int grade5 = 0;
    int grade6 = 0;
    int grade7 = 0;
    int grade8 = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 8 grades..");
    grade1 = in.nextInt();
    grade2 = in.nextInt();
    grade3 = in.nextInt();
    grade4 = in.nextInt();
    grade5 = in.nextInt();
    grade6 = in.nextInt();
    grade7 = in.nextInt();
    grade8 = in.nextInt();
    int mean = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8)/8;

    Scanner in1 = new Scanner(System.in);
    System.out.println("Enter a project grade");
    int project = in1.nextInt();


    int[] grades = new int[10];
    grades[0] = grade1;
    grades[1] = grade2;
    grades[2] = grade3;
    grades[3] = grade4;
    grades[4] = grade5;
    grades[5] = grade6;
    grades[6] = grade7;
    grades[7] = grade8;
    grades[8] = project;
    grades[9] = mean;

    String output = getResult(grades);
    System.out.println(output);
  }
  public static String getResult(int[] grades) {
    String result = "0";


      if (grades[0] < 0 || grades[0] > 100 ||
          grades[1] < 0 || grades[1] > 100 ||
          grades[2] < 0 || grades[2] > 100 ||
          grades[3] < 0 || grades[3] > 100 ||
          grades[4] < 0 || grades[4] > 100 ||
          grades[5] < 0 || grades[5] > 100 ||
          grades[6] < 0 || grades[6] > 100 ||
          grades[7] < 0 || grades[7] > 100 ||
          grades[8] < 0 || grades[8] > 100) {
        String result1 = "Error";
        return result1;

      } else if (grades[0] < 40 || grades[1] <40 ||
                  grades[2] <40 || grades[3] <40 ||
                  grades[4] <40 || grades[5] <40 ||
                  grades[6] <40 || grades[7] <40 ||
                  grades[8] < 40 ) {
        String result1 = "Fail";
        return result1;

      } else if (grades[9] < 40) {
        String result1 = "Fail";
        return result1;

      } else if (grades[9] < 50 || grades[8] < 50) {
        String result1 = "Pass";
        return result1;

      } else if (grades[9] < 70 || grades[8] < 70) {
        String result1 = "Merit";
        return result1;

      } else if (grades[9] >= 70 && grades[8] >= 70) {
        String result1 = "Distinction";
        return result1;
      }
      return result;
  }
}
