package com.vcentry.exceptions;

public class UnCheckedException {
	public static void main(String[] a) {
		int[] myArray = { 1, 2, 3 };
		handleArray(myArray);
	}

	public static void handleArray(int[] myArray) {
		try {
			System.out.println(myArray[4]);
			System.out.println("Hello");
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("Exception" + e);
		}
		System.out.println("Hello after catch");
		System.out.println("Hello after catch");
	}
}
