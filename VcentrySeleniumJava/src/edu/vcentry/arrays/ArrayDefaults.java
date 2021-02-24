package edu.vcentry.arrays;

import java.util.Arrays;

public class ArrayDefaults {
	
	public static void main(String args[]) {
		arrayDefaults();
	}
	
	public static void arrayDefaults() {
		int[] myIntArray = new int[3];
		System.out.println("Default values of int array is " + Arrays.toString(myIntArray));
		char[] myCharArray = new char[3];
		System.out.println("Default values of char array is " + Arrays.toString(myCharArray));
	}

}
