package com.vcentry.arraylist;

public class FindANumberInArray {
	
	public static void main(String args[]) {
		int[] myArray = { 1, 2, 3, 4, 5};
		System.out.println("Number found - " + findInArray(myArray, 2));
		System.out.println("Number found - " + findInArray(myArray, 9));

	}
	
	public static boolean findInArray(int[] arr , int numToFind) {
		boolean found = false;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == numToFind) {
				found = true;
				break;
			}
		}
		return found;
	}
}
