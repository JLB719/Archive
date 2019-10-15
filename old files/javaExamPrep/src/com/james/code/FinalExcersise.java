package com.james.code;

import java.util.Scanner;

public class FinalExcersise
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an mathematical expression");
		String output = in.nextLine();
		in.close();
		String[] splited = output.split(" ");
		int firstInt = Integer.parseInt(splited[0]);
		char operator = splited[1].charAt(0);
		int secondInt = Integer.parseInt(splited[2]);
		if (operator != '/' && secondInt != 0) {
			System.out.println(eval(firstInt, secondInt, operator));
		} else {
			System.out.println("Ivalid expression");
		}
	}
	public static float eval(int operand1, int operand2, char operator) {
		if (operator == '+') {
			return operand1 + operand2;
		}
		if (operator == '-') {
			return operand1 - operand2;
		}
		if (operator == '*') {
			return operand1 * operand2;
		}
		if (operator == '/') {
			return (float)operand1 / (float)(operand2);
		}
		return 0;
	}

}
