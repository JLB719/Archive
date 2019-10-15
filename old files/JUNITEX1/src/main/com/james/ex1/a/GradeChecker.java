package com.james.ex1.a;
import java.util.Scanner;
public class GradeChecker {
    public static void main(String[] args) {
        Scanner gradeInput = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = gradeInput.nextInt();
        // scanner.close();
        boolean valid = isValid(grade);
        boolean pass = isPass(grade);
        if (valid == false) {
            System.out.println("Invalid input");
        } else if (pass == true) {
            System.out.println("Pass");
        } else if (pass == false) {
            System.out.println("Fail");
        }

    }
    public static boolean isValid(int grade) {
        int minimumValidGrade = 0;
        int maximumValidGrade = 100;
        if (grade >= minimumValidGrade && grade <= maximumValidGrade) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPass(int grade) {
        int passGrade = 40;
        if (grade >= passGrade) {
            return true;
        } else {
            return false;
        }
    }
}
