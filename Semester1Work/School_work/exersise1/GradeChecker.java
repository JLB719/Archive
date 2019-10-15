package com.bham.pij.exercises.e1a;
import java.util.Scanner;
public class GradeChecker {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the grade");
    int grade = in.nextInt();
    boolean valid = isValid(grade);
    boolean pass = isPass(grade);
    if (valid == true && pass == true) {
      System.out.println("Pass");
    } else if (valid == true && pass == false) {
      System.out.println("Fail");
    } else {
      System.out.println("Invalid input");
    }

  }
  public static boolean isValid(int grade) {
    boolean valid;
    if (grade >= 0 && grade <= 100) {
      return true;
    } else {
      return false;
    }

  }
  public static boolean isPass(int grade) {
    boolean pass;
    if (grade >= 40) {
      pass = true;
      return pass;
    } else {
      pass = false;
      return pass;
    }
    }

  }
