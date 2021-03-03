package edu.vcentry.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> myFruitSet = new HashSet<String>();
		myFruitSet.add("Apple");
		myFruitSet.add("Orange");
		myFruitSet.add("Pine Apple");
		myFruitSet.add("Apple"); // Duplicate value not allowed.
		System.out.println("!!!!!!!! Using For : !!!!!!!!!");
		for(String fruit : myFruitSet) {
			System.out.println(fruit);
		}
		System.out.println("!!!!!!!! Using Iterator !!!!!!!!!");
		Iterator<String> iter = myFruitSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
