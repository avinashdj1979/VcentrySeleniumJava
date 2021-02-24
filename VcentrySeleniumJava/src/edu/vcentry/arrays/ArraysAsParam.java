package edu.vcentry.arrays;

import java.util.Arrays;

public class ArraysAsParam {

	public static void main(String[] args) {
		
		String[] myStringArray = {"one", "two", "three"};
		
		System.out.println("Before Sending as Param and modification");
		printArray(myStringArray);
		
		changeValue(myStringArray);
		
		System.out.println("After Sending as Param and modification");

		printArray(myStringArray);

	}
	
	public static void changeValue(String[] myStrArr) {
		myStrArr[2] = "four";
	}
	
	public static void printArray(String[] myStringArray) {
		System.out.println(Arrays.toString(myStringArray));
		
		// Print elements one by one
//		for(int i = 0; i < myStringArray.length; i++) {
//			System.out.printf("%d element of Array is %s\n", i, myStringArray[i]);
//		}
	}

}
