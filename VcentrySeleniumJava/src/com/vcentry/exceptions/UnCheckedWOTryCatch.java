package com.vcentry.exceptions;

public class UnCheckedWOTryCatch {
	public static void main(String[] a) {
		int[] myArray = { 1, 2, 3 };
		handleArray(myArray);
	}

	public static void handleArray(int[] myArray) {
		System.out.println(myArray[4]);
		System.out.println("Hello");
		System.out.println("Hello");
	}
}
