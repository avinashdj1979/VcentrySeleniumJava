package com.vcentry.arrays;

import java.util.Arrays;

public class InitializeArrayWithLoop{

	public static void main(String[] args) {
		arrayInitializeWithLoop();
	}
	
	public static void arrayInitializeWithLoop() {
		int[] myIntArray = new int[3];
		for (int i = 0; i < 3; i++) {
			myIntArray[i] = 2 + ( i * 2);
		}
		
		System.out.printf("My Array Length is %d\n", myIntArray.length);
		
		//Print Array using Loop
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.printf("The value in %dth index is %d\n", i, myIntArray[i]);
		}
		
		// Print Array without using loop
		System.out.println("Array printing without loop::" + Arrays.toString(myIntArray));
	}
}
