package com.james.code;
import java.util.*;
public class excersie10
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Input a number to stop inpot a negative or 0");
			int number = in.nextInt();
			in.close();
			
			if (number <= 0) {
				break;
			} else if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else if (number % 2 == 1) {
				System.out.println(number + " is odd");
			}
		}
	}

}
