package com.james.code;
import java.util.Scanner;
public class Excersie12
{
	public static void main(String[] args) {
		double mean = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int input = in.nextInt();
		double meanCount = 0;
		while(input > 0) {
			mean += input;
			meanCount++;
			if (input < min) {
				min = input;
			}
			if (input > max) {
				max = input;
			}
			input = in.nextInt();
		}
		in.close();
		System.out.println("The max value is " + max);
		System.out.println("The min value is " + min);
		System.out.println("The range is " + (max - min));
		System.out.println("The mean is " + (mean / meanCount));
	}
}
