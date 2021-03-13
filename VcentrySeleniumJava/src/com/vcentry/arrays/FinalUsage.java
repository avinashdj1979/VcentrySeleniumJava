package com.vcentry.arrays;

import java.util.Arrays;

public class FinalUsage {

	public static void main(String[] args) {
		final int myInt; // = 2;
		myInt = 4;
		
		//myInt = 6;
		
		int[] myIntArray = {1, 2, 3};
		myIntArray[2] = 30;
		
		final int[] mySecondArray = new int[3];
		//mySecondArray[2] = 50;
		
		System.out.println(Arrays.toString(myIntArray));
		
		//mySecondArray = myIntArray;
		
		final int[] myThirdArray;
		myThirdArray = myIntArray;
	}

}
