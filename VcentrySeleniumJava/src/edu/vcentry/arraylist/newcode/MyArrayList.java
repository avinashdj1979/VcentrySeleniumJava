package edu.vcentry.arraylist.newcode;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();

		myList.add("One");
		myList.add("Two");
		myList.add("Four");
		
		System.out.println(myList);
		
		myList.add(2, "Three");
		
		System.out.println(myList);
		
		String replacedItem = myList.set(1,  ":2:");
		System.out.printf("Item replaced is %s\n", replacedItem);
		
		System.out.println(myList);
		
		String removedItem = myList.remove(3);
		System.out.printf("Item removed is %s\n", removedItem);
		System.out.println(myList);
		
		myList.remove("Three");
		System.out.println("*** removed Three *** ");
		System.out.println(myList);
		
		myList.add("Three");
		myList.add("Four");
		
		System.out.println(myList);
	}

}
