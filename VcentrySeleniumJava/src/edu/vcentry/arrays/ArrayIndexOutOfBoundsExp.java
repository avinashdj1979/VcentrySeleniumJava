package edu.vcentry.arrays;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsExp {

	public static void main(String[] args) {
		
		String[] myStringArray = {"one", "two", "three"};
		printArray(myStringArray);

	}
	
	public static void printArray(String[] myStringArray) {
		System.out.println(Arrays.toString(myStringArray));
		
		for(int i = 0; i <= myStringArray.length; i++) {
			System.out.printf("%d element of Array is %s\n", i, myStringArray[i]);
		}
	}
}
