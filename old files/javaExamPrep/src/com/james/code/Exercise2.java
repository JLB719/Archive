package com.james.code;
import java.util.Scanner;
public class Exercise2
{

	public static void main(String[] args)
	{
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int number1 = in1.nextInt();
		in1.close();
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter the second integer");
		int number2 = in2.nextInt();
		in2.close();
		if ((number1 * number2) < 100) {
			System.out.println("product is less than 100");
		}

	}

}
