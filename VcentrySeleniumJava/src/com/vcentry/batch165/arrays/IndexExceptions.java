package com.vcentry.batch165.arrays;

import java.util.Arrays;

public class IndexExceptions {

	public static void main(String[] args) {
		
		double[] myArray = {1.0, 2.2, 3.4};
		
		for(int i = 0; i < 3; i++) {
			myArray[i] = i * 3;
		}
		
		for(int i=0; i < myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("***************");
		
		for(int i=(myArray.length - 1);i >=-1;i--) {
			System.out.println(myArray[i]);
		}
		
		String s = "abc,123,ABC";
		String sArr[] = s.split(",");

	}
}


