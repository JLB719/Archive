package com.james.code;
import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        int previousInt = 0;
        ArrayList<Integer> inputList = new ArrayList<>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter an integer");
            int input = in.nextInt();
            if (input < 0) {
                break;
            } else {
            inputList.add(input);
        }
        }
        System.out.println("Mean is " + mean(inputList));
        SortList(inputList);
        System.out.println("Sorted list is " + inputList);
        System.out.println("The max value is " + max(inputList));
        System.out.println("The min value is " + min(inputList));
        System.out.println("The range is " + range(inputList));
        System.out.println("The median is " + median(inputList));
    }
    public static double mean(ArrayList<Integer> input) {
        int runTotal = 0;
        for (int i = 0; i < input.size(); i++) {
            runTotal += input.get(i);
        }
        return (runTotal/input.size());
    }
    public static void SortList(ArrayList<Integer> input) {
        int sizeOfInput = input.size();
        for (int i = 0; i < sizeOfInput; i++) {
            int maxInt = Integer.MAX_VALUE;
            int insert = i;
            for (int j = i; j < sizeOfInput; j++) {
                int current = input.get(j);

                if (current < maxInt) {


                    maxInt = current;
                }

            }
            int indexOfCurrent = input.indexOf(maxInt);
            input.remove(indexOfCurrent);
            input.add(insert, maxInt);
        }
    }
    public static int max (ArrayList<Integer> input) {
        SortList(input);
        return input.get(input.size() - 1);
    }
    public static int min (ArrayList<Integer> input) {
        SortList(input);
        return input.get(0);
    }
    public static int range(ArrayList<Integer> input) {
        SortList(input);
        return input.get(input.size() - 1) - input.get(0);
    }
    public static double median(ArrayList<Integer> input) {
        int listSize = input.size();
        SortList(input);
        if (listSize % 2 == 1) {
            int medianPostion = (listSize / 2) + 1;
            return input.get((listSize / 2));
        }
        if (listSize % 2 == 0) {
            int firstNumber = input.get(listSize / 2);
            System.out.println("First number is " + firstNumber);
            int secondNumber = input.get((listSize / 2) - 1);
            System.out.println("Second number is " + secondNumber);
            double first = (firstNumber + secondNumber);
            double division = first / 2;
            System.out.println("First number + second number is " + first);
            System.out.println("Division " +  division);
            double median = division;
            return median;
        }


        return 0;
    }
    // public static int mode(ArrayList<Input> input) {


}
