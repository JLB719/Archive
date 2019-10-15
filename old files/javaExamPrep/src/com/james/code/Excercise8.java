package com.james.code;

import java.util.Scanner;

public class Excercise8
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 20");
		int number = input.nextInt();
		input.close();
		String output = "";
		if (number >= 0) {
			for (int i = 0; i < number; i++) {
				output += "*";
			}
		}
		if (number < 0) {
		number = Math.abs(number);
		for (int i = 0; i < number; i++) {
			output += "/";
		}
		}
		System.out.println(output);
	}

}
