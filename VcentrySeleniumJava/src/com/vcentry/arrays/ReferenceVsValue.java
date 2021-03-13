package com.vcentry.arrays;

import java.util.Arrays;

public class ReferenceVsValue{

	public static void main(String[] args) {
		
		int myIntValue = 4;
		System.out.println("myIntValue before modification thru assignment" + myIntValue);
		int myNewIntValue = myIntValue;
		myNewIntValue = 5;
		System.out.println("myIntValue After modification thru assignment" + myIntValue);
		
		decorator();
		
		System.out.println("myIntValue before modification thru method" + myIntValue);
		modifyIntValue(myIntValue);
		System.out.println("myIntValue After modification thru method " + myIntValue);
		
		int[] myIntArray = {1, 2, 3};
		int[] myNewIntArray = myIntArray;
		
		decorator();
		
		System.out.println("Before Updating the reference " + Arrays.toString(myIntArray));
		myNewIntArray[2] = 5;
		System.out.println("After Updating the reference " + Arrays.toString(myIntArray));
		decorator();
		
		System.out.println("Before Updating the reference using Method param" + Arrays.toString(myIntArray));
		modifyIntArrayThruMethodParam(myIntArray);
		System.out.println("After Updating the reference  using Method param" + Arrays.toString(myIntArray));
		decorator();

	}
	
	public static void modifyIntValue(int myIntValue) {
		myIntValue = 7;
	}
	
	public static void modifyIntArrayThruMethodParam(int[] myReferenceArray) {
		myReferenceArray[0] = 300;
	}
	
	public static void decorator() {
		System.out.println("\n******************\n");
	}

}
