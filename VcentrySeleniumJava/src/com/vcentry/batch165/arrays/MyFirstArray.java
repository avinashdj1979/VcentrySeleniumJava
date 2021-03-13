package com.vcentry.batch165.arrays;

import java.util.Arrays;

public class MyFirstArray {

	public static void main(String[] args) {
		
		int myArray[] = new int[10];
		//myArray = {1, 2, 3}; // either 7 or 8 is allowed not both
		
		double[] d = {1.0, 2.2};
		
		System.out.println(d[0]);
		
		for(int i = 0; i < 3; i++) {
			myArray[i] = i * 3;
		}
		
		//System.out.println(myArray);
		
		System.out.println("Length of array is " + myArray.length);
		
		for(int i=0; i < myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println(Arrays.toString(myArray));
	}
}


