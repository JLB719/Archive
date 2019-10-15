package com.james.code;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class Excersise506
{
	private static final Logger logger = Logger.getLogger(Excersise506.class);
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a new line");
	String integerArray = in.nextLine();
	in.close();
	int set[] = splitAndStore(integerArray);
	System.out.println(Arrays.toString(set));
	System.out.println(Arrays.toString(createSet(set)));
	
	}
	public static int[] createSet(int[] values) {
		String integerStream = "";
		int[] returnArray = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			int examine = values[i];
			
			boolean repeated = false;
			for (int j = i+1; j < values.length; j++) {
				if (examine == values[j]) {
					repeated = true;
				}
				
			}
			
			if (repeated == false) {
				integerStream += examine + " ";
				returnArray[i] = examine;
			} 
		}
		return splitAndStore(integerStream);
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
