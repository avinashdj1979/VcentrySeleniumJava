package com.vcentry.exceptions;

public class FinallyWOCatch {
	public static void main(String[] a) {
		int[] myArray = { 1, 2, 3 };
		handleArray(myArray);
	}

	public static void handleArray(int[] myArray) {
		try {
			System.out.println(myArray[4]);
			System.out.println("Hello After Exception");
			System.out.println("Hello After Exception");
		}finally {
			System.out.println("Hello within Finally");
			System.out.println("Hello within finally");
		}
		System.out.println("Hello after Finally");
		System.out.println("Hello after Finally");
	}
}
