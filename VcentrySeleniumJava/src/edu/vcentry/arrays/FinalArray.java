package edu.vcentry.arrays;

import java.util.Arrays;

public class FinalArray {

	public static void main(String[] args) {
		final int myInt = 2;
		//myInt = 4;
		
		final int[] myIntArray = new int[2];
		myIntArray[0] = 10;
		myIntArray[1] = 20;
		
		printArray(myIntArray);
		
		 int[] mySecondArr = {1, 2};
		mySecondArr[1] = 3;
		
		printArray(mySecondArr);
		
		mySecondArr = myIntArray;
		
		printArray(mySecondArr);


	}
	
	public static void printArray(int[] toPrint) {
		System.out.println(Arrays.toString(toPrint));
	}

}
