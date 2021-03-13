package com.vcentry.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Three");
		myArrayList.add("Four");
		
		//printArray(myArrayList);
		
		replaceItem(myArrayList, "One","Five");
		
		if(myArrayList.contains("Two")) {
			System.out.println("I found the Element Searched");
		} else {
			System.out.println("Element not found");
		}
		
		decorator();
		
		if(myArrayList.indexOf("Two") >= 0) {
			System.out.println("I found the Element Searched");
		} else {
			System.out.println("Element not found");
		}
		
		decorator();
		
		System.out.println("Index of the element searched is " + myArrayList.indexOf("two"));
		System.out.println("Index of the element searched is " + myArrayList.indexOf("Four"));
		
		decorator();
		
		String removedItem = myArrayList.remove(3);
		
		System.out.printf("Removed Item is %s\n", removedItem);
		printArrayUsingIndex(myArrayList);
		
		//Insert based on index
		myArrayList.add(2, "Two.And.Half");
		printArrayUsingIterator(myArrayList);
		
		//Modify the existing value
		String replacedString = myArrayList.set(0, "I replaced One");
		System.out.printf("Replaced Item is %s\n", replacedString);
		printArrayUsingIterator(myArrayList);
		
		myArrayList.remove("Three");
		printArrayUsingIterator(myArrayList);
		
		ArrayList<String> copyArray = new ArrayList<String>();
		copyArray.addAll(myArrayList);
		copyArray.add("Copy Array - New Four");
		printArrayUsingIterator(copyArray);
		
		ArrayList<String> copyArray2 = new ArrayList<String>(copyArray);
		copyArray2.add("Copy Array2 - New Five");
		printArrayUsingIterator(copyArray2);
	}
	
	private static void printArray(ArrayList<String> arrayList) {
		System.out.println("Printing Array List using for Each");
		System.out.print("[");
		for(String number: arrayList) {
			System.out.printf("%s, ", number);
		}
		System.out.print("]");
		decorator() ;
	}
	
	private static void printArrayUsingIndex(ArrayList<String> arrayList) {
		System.out.println("Printing Array List using Index");
		System.out.print("[");
		for(int i = 0;i < arrayList.size();i++) {
			System.out.printf("%s, ", arrayList.get(i));
		}
		System.out.print("]");
		decorator() ;
	}
	
	private static void printArrayUsingIterator(ArrayList<String> arrayList) {
		System.out.println("Printing Array List using Iterator");
		System.out.print("[");
		Iterator<String> iter = arrayList.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s, ", iter.next());
		}
		System.out.print("]");
		decorator() ;
	}
	
	private static void decorator() {
		System.out.println("\n**********");
	}

	private static void replaceItem(ArrayList<String> arr, String oldItem, String newItem) {
		//indexOf
		//set
	}
}
