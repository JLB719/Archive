package com.james.code;

import java.util.Scanner;

public class Exercise5
{

	public static void main(String[] args)
	{
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter number 1");
		int number1 = in1.nextInt();
		in1.close();
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter number 2");
		int number2 = in2.nextInt();
		in2.close();
		Scanner in3 = new Scanner(System.in);
		System.out.println("Enter number 3");
		int number3 = in3.nextInt();
		in3.close();
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println(number2);
		} else if (number3 > number1 && number3 > number2) {
			System.out.println(number3);
		}
	}

}
