package com.james.code;

import java.util.Scanner;
import java.util.Arrays;
public class Exersise1a
{
public static void main(String[] args) {
	while (true) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the integer");
	int number = in.nextInt();
	if (number < 0) {
		break;
		
	}
	System.out.println(number%13);
	
	}
}
public static boolean match(String s1, String s2) {
	if (s1.length() != s2.length()) {
		return false;
	}
	for (int i = 0; i < s1.length(); i++) {
		char seeChar1 = s1.charAt(i);
		char seeChar2 = s2.charAt(i);
		System.out.println(Character.isAlphabetic(seeChar1));
		
		if (seeChar2 == '?' && !Character.isLetter(seeChar1)) {
			System.out.println("Going here");
			return false;
		} else if (seeChar2 != '*' && seeChar2 != '?' && seeChar1 != seeChar2) {
			System.out.println("Gone here");
			return false; 
		}
	}
	return true;
}
public static int computeRange(int[] values) {
	int highest = values[0];
	int lowest = values[0];
	for (int i = 0; i < values.length; i++) {
		if (values[i] > highest) {
			highest = values[i];
		}
		if (values[i] < lowest) {
			lowest = values[i];
		}
	}
	return highest - lowest;
}
public static boolean areMirror(String s1, String s2) {
	if (s1 == null || s2 == null) {
		return false;
	}
	if (s1.length() != s2.length()) {
		return false;
	}
	int s2track = s2.length() - 1;
	for (int i = 0; i < s1.length(); i++) {
		if (s1.charAt(i) != s2.charAt(s2track)) {
			return false;
		}
		s2track--;
	}
	return true;
}
}
