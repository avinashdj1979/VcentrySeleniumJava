package com.vcentry.batch165.collections.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();

		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");

		System.out.println("My Array list contains One (True or False) - " + myList.contains("One"));

		System.out.println("Index of ABC is " + myList.indexOf("Four"));
		
		if (myList.indexOf("Navin") != -1) {
			System.out.println("My Array list contains Navin");
		} else {
			System.out.println("My Array list do not contain Navin");
		}

		ArrayList<String> myNewList = new ArrayList<String>();
		myNewList.addAll(myList);
		myNewList.add(2, "Three");

		System.err.println("My New List is " + myNewList);
		
		set("Two", ":2:",myList);
		ArrayList<String> myList2 = setAndReturn("Three", ":3", myList);
		System.out.println(myList2);
		
		System.out.println("**********");
		System.out.println("My List printing using for each Item");
		for(String item: myList2) {
			System.out.println(item);
		}
		System.out.println("**********");
		System.out.println("My List printing using Index");
		for(int i =0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("**********");
		System.out.println("My List printing using Iterator");
		Iterator iter = myList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static void set(String oldValue, String newValue, ArrayList<String> myList){
		
		int indexOfOldValue = myList.indexOf(oldValue);
		
		if(indexOfOldValue != -1) {
			myList.set(indexOfOldValue, newValue);
			System.out.printf("%s replaced by %s\n", oldValue, newValue);
		} else {
			System.out.println(oldValue + " Not Found");
		}

		System.out.println(myList);
	}
	
	public static ArrayList<String> setAndReturn(String oldValue, String newValue, ArrayList<String> myList){
		
		int indexOfOldValue = myList.indexOf(oldValue);
		
		if(indexOfOldValue != -1) {
			myList.set(indexOfOldValue, newValue);
			System.out.printf("%s replaced by %s\n", oldValue, newValue);
		} else {
			System.out.println(oldValue + " Not Found");
		}

		return myList;
	}

}
