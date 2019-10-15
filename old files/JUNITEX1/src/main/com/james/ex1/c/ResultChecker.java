package com.james.ex1.c;
import java.util.Scanner;
public class ResultChecker {
    public static void main(String[] args) {
        int[] gradesandProject = new int[9];
        for (int i = 0; i < 8; i++) {
            Scanner inputGrade = new Scanner(System.in);
            System.out.println("Enter a grade");
            gradesandProject[i] = inputGrade.nextInt();
        }
        Scanner inputProject = new Scanner(System.in);
        System.out.println("Enter a project grade");
        gradesandProject[8] = inputProject.nextInt();
        System.out.println(getResult(gradesandProject));
    }
    public static double mean(int[] listOfGrades) {
        int meanSum = 0;
        for (int i = 0; i < listOfGrades.length; i++) {
            meanSum += listOfGrades[i];
        }
        double mean = meanSum / listOfGrades.length;
        return mean;
    }
    public static boolean isValid(int grade) {

        if (grade < 0 || grade > 100) {
            return false;
        } else {
            return true;
        }
    }
    public static String getResult(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (isValid(grades[i]) == false) {
                return "ERROR";
            } else if (grades[i] < 40) {
                return "FAIL";
            }
        }
        int newListSize = grades.length - 1;
        int[] meanGrades = new int[newListSize];
        for (int i = 0; i < grades.length - 1; i++) {
            meanGrades[i] = grades[i];
        }
        int endOfList = grades.length - 1;
        int projectGrade = grades[endOfList];
        double meanGrade = mean(meanGrades);
        if (meanGrade  < 40) {
            return "FAIL";
        } else if (meanGrade < 50 || projectGrade < 50) {
            return "PASS";
        } else if (meanGrade < 70 || projectGrade < 70) {
            return "MERIT";
        } else if (meanGrade >= 70 && meanGrade >= 70) {
            return "DISTINCTION";
        }
        return null;
    }
}
