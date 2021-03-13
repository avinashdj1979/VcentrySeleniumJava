package com.vcentry.batch165.arrays;

public class ArrayChallenge {

	public static void main(String[] args) {
		reverseWordsInString("This,is,my,String");
	}
	
	public static String[] reverseWordsInString(String str) {
		String strArray[] = str.split(",");
		System.out.println(strArray.length);
		int startIndex = (strArray.length - 1);
		for(int i = startIndex; i >= 0; i--) {
			System.out.printf("%S, ", strArray[i]);
		}
		return strArray;
	}
}
