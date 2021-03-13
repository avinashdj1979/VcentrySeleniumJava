package com.vcentry.arrays;

import java.util.Arrays;

public class ArrayAsParameter {
	
	public static void main(String args[]) {
		String[] myStrArr = {"one", "five", "ten"};
		printArray(myStrArr);
		
		seperator();
		
		System.out.println("After changing my Array");
		printArray(myStrArr);
		
		seperator();
		/*********** int ***********/
		int myNum = 2;
		printNum(myNum);
		
		seperator();
		
		System.out.println("After changing my number to 4");
		System.out.println(myNum);
	}

	public static void printArray(String[] myArray) {
		System.out.println(Arrays.toString(myArray));
		myArray[2] = "Changed ten to five";
	}
	
	public static void printNum(int m) {
		System.out.println("My Num is:" + m);
		m = 4;
	}

	private static void seperator() {
		System.out.println("\n***************");
	}
}
