package com.james.ex1.b;
import java.util.Scanner;
public class MeanGrade {
    public static final int maxNumberOfGrades = 4;
    public static void main(String[] args) {
        int[] grades = new int[maxNumberOfGrades];
        for (int i = 0; i < maxNumberOfGrades; i++) {
            grades[i] = 0;
        }
        for (int i = 0; i < maxNumberOfGrades; i++) {
            Scanner inputGrade = new Scanner(System.in);
            System.out.println("Enter a grade");
            int grade = inputGrade.nextInt();
            if (grade < 0 || grade > 100) {
                grades[i] = -1;
                break;
            }
            grades[i] = grade;
        }
        for (int i = 0; i < maxNumberOfGrades; i++) {
            System.out.println(grades[i]);
        }
        System.out.println(computeMean(grades));
    }

    public static double computeMean (int[] grades) {
        int gradeCount = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == -1) {
                break;
            } else {
                gradeCount++;
            }
        }
        int[] newGrades = new int[gradeCount];
        for (int i = 0; i < gradeCount; i++) {
            newGrades[i] = grades[i];
        }
        int meanGradeSum = 0;
        for (int i = 0; i < gradeCount; i++) {
            meanGradeSum += newGrades[i];
        }
        double meanGrade = meanGradeSum / gradeCount;
        return meanGrade;
    }
}
