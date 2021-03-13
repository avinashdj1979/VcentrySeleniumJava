package com.vcentry.arrays;

public class MyFirstArray {

	public static void main(String[] args) {
			myInts();
	}
	
	public static void myInts() {
		
		int[] myIntArray = new int[5]; // since new is used, we can confirm that Array is treated as an object in java
		myIntArray[4] = 56;
		System.out.println("4th index contains " + myIntArray[4]);
		System.out.println("3rd index is not initialized so intialized to zero ! - " + myIntArray[3]);
		
		int[] myIntArray3 = { 1, 2, 30, 40, 50};
		System.out.println(myIntArray3[0]);
		
		
		int myIntArray2[] = new int[5]; //C++ Convention
	}

}
