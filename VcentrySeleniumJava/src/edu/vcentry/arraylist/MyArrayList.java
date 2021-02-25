package edu.vcentry.arraylist;

import java.util.ArrayList;

public class MyArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Three");
		
		String mySecondValue = myArrayList.get(2);
		
		System.out.println(mySecondValue);
		
		
	}

}
