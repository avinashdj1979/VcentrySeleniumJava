package com.vcentry.exceptions;

public class Finally {
	public static void main(String[] a) {
		int[] myArray = { 1, 2, 3 };
		handleArray(myArray);
	}

	public static void handleArray(int[] myArray) {
		try {
			System.out.println(myArray[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
		} finally {
			System.out.println("Hello");
			System.out.println("Hello");
		}
		System.out.println("Hello after catch");
		System.out.println("Hello after catch");
	}
}
