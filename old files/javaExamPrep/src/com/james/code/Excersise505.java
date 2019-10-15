package com.james.code;

import java.util.Scanner;

public class Excersise505
{
	public static void main(String[] args) {
		Scanner inFirst = new Scanner(System.in); 
		System.out.println("INput a load of integers");
		String input = inFirst.nextLine();
		
		int[] sum = splitAndStore(input);
		
		System.out.println("Input an index");
		int indexed = inFirst.nextInt();
		
		if (indexed >= 1 && indexed < sum.length) {
			System.out.println("The sum is " + sum(sum, indexed));
		}
	}
	public static int sum(int[] values, int index) {
		index = index -1;
		int runSum = 0;
		for (int i = index; i < values.length; i++) {
			runSum += values[i];
		}
		return runSum;
	}
	public static int[] splitAndStore(String x) {
		String[] conversion = x.split(" ");
		int[] passed = new int[conversion.length];
		for (int i = 0; i < conversion.length; i++) {
			passed[i] = Integer.parseInt(conversion[i]);
			System.out.println(passed[i]);
		}
		return passed;
	}
}
