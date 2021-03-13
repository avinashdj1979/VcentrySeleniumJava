package com.vcentry.batch165.exceptions;

public class MyUnCheckedException {

	public static void main(String[] args) {
		call1();
	}

	public static void call1() {
		call2();
		call3();
	}
	
	public static void call2() {
		int[] myArray = {1, 3 ,5, 7};
		System.out.println(myArray[4]);
		System.out.println("After accessing the Array");
	}
	
	public static void call3() {
		int[] myArray = {1, 3 ,5, 7};
		try {
			System.out.println(myArray[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("After accessing the Array");
	}
	
}
