package com.vcentry.arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		int[] arr3 = arr2;
		int[] arr4 = arr1;
		arr4[2] = 30;
		
		arr1[2] =1;
		System.out.println(arr1[2]);

	}

}
