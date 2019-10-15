package com.bham.pij.exercises.e1b;
import java.util.Scanner;
public class MeanGrade {
  public static void main(String[] args) {
    Scanner in1 = new Scanner(System.in);
    System.out.println("Enter the first grade");
    int grade1 = in1.nextInt();
    if (grade1 >= 0 && grade1 <= 100) {
      grade1 = grade1;
    } else {
      grade1 = 0;
    }
    Scanner in2 = new Scanner(System.in);
    System.out.println("Enter the second grade");
    int grade2 = in2.nextInt();
    if (grade2 >= 0 && grade2 <= 100) {
      grade2 = grade2;
    } else {
      grade2 = 0;
    }
    Scanner in3 = new Scanner(System.in);
    System.out.println("Enter the third grade");
    int grade3 = in3.nextInt();
    if (grade3 >= 0 && grade3 <= 100) {
      grade3 = grade3;
    } else {
      grade3 = 0;
    }
    Scanner in4 = new Scanner(System.in);
    System.out.println("Enter the fourth grade");
    int grade4 = in4.nextInt();
    if (grade4 >= 0 && grade4 <= 100) {
      grade4 = grade4;
    } else {
      grade4 = 0;
    }
    int[] grades = new int[4];
    grades[0] = grade1;
    grades[1] = grade2;
    grades[2] = grade3;
    grades[3] = grade4;
    double mean = computeMean(grades);
    System.out.println("The mean grade is " + mean);

  }
  public static double computeMean(int[] grades) {
    double result = 0;
    for (int i = 0; i < grades.length; i++) {
      result += grades[i];
    }
    return result / grades.length;



  }

}
