package com.james.code;

import java.util.Scanner;

public class Excersise401
{
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer press a negative number to stop");
	int firstNumber = in.nextInt();
	
	String numberString = " ";
	if (firstNumber >= 0) {
		numberString += firstNumber + " ";
		int i = 1;
		while(i < 10) {
			int number = in.nextInt();
			if (number <= 0) {
				break;
			}
			numberString += number + " ";
			i++;
		}
	}
	System.out.println(numberString);
	
}
}
