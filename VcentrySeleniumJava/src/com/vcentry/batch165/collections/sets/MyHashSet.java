package com.vcentry.batch165.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {
		Set<String> myGoals = new HashSet<String>();
		myGoals.add("Sleep for 6 hours");
		myGoals.add("Get ready");
		myGoals.add("Work hard for 16 hours");
		//Added sleep again
		myGoals.add("Sleep for 6 hours");
		
		System.out.println("size of my set is - " + myGoals.size());
		
		for(String myGoal : myGoals) {
			System.out.println(myGoal);
		}
		
		System.out.println("\n** Using Lamdas **");
		myGoals.forEach((v) -> System.out.println(v));
	}

}
