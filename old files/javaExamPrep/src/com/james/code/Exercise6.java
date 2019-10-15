package com.james.code;

import java.util.Scanner;

public class Exercise6
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("You can convert between pounds euros dolloars and rupiah");
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter an amount of money followed by a space then the current currency then another space then the currency you wish to convert to");
		String input = input1.nextLine();
		input1.close();
		int firstSpace = input.indexOf(" ");
		int secondSpace = input.lastIndexOf(" ");
		System.out.println(firstSpace);
		System.out.println(secondSpace);
		if (firstSpace != -1 && secondSpace != -1 && firstSpace != secondSpace) {
			char conversionFrom = input.charAt(firstSpace + 1);
			System.out.println(conversionFrom);
			char conversionTo = input.charAt(secondSpace + 1);
			System.out.println(conversionTo);
			double number = Double.parseDouble(input.substring(0, (firstSpace)));
			System.out.println(number);
			if(conversionFrom == 'g' && conversionTo == 'd') {
				
			} else if(conversionFrom == 'g' && conversionTo == 'd') {
				System.out.println(number * 1.32 + "dollars");
			} else if(conversionFrom == 'g' && conversionTo == 'e') {
				System.out.println(number * 1.16 + "Euros");
			} else if(conversionFrom == 'g' && conversionTo == 'i') {
				System.out.println(number * 1);
			} else if(conversionFrom == 'd' && conversionTo == 'g') {
				
			} else if(conversionFrom == 'd' && conversionTo == 'e') {
				
			} else if(conversionFrom == 'd' && conversionTo == 'i') {
				
			} else if(conversionFrom == 'i' && conversionTo == 'd') {
				
			} else if(conversionFrom == 'i' && conversionTo == 'e') {
				
			} else if(conversionFrom == 'i' && conversionTo == 'g') {
				
			}else if(conversionFrom == 'e' && conversionTo == 'd') {
				
			}else if(conversionFrom == 'e' && conversionTo == 'g') {
				
			}else if(conversionFrom == 'e' && conversionTo == 'i') {
				
			} else {
//				System.out.println("no registered character")
			}
		}
		
	}

}
