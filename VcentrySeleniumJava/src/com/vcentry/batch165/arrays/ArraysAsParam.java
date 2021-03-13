package com.vcentry.batch165.arrays;

import java.util.Arrays;

public class ArraysAsParam {

	public static void main(String[] args) {
		int a =4;
		int b = a;
		
		String[] myStrArray = new String[3];
		printArray(myStrArray);
		for(int i=0; i < myStrArray.length; i++) {
			System.out.println(myStrArray[i]);
		}

		printMyNum(b);
		System.out.println("B after modification");
		System.out.println(b);
	}

	public static void printArray(String[] myArr) {
		myArr[0] = "This";
		myArr[1] = "Is";
		myArr[2] = "String Array";
		System.out.println(Arrays.toString(myArr));
	}
	
	public static void printMyNum(int c) {
		System.out.println(c);
		c = 6;
	}
}
