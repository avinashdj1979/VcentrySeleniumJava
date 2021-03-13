package com.vcentry.batch165.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[ ] agrs) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Item1");
		myList.add("Item2");
		
		myList.add(1, "item3");
		
		System.out.println(myList);
		
		for(String item : myList) {
			System.out.printf("The item is %s\n", item);
		}
		
		Iterator iter = myList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		// Converts ArrayList to Array.
		Object[] myStrArr = myList.toArray();
		
		System.out.println(myStrArr[1]);
		
		for(Object s : myStrArr) {
			System.out.println(s);
		}
	}

}
