package com.vcentry.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MySet {
	
	public static void main(String[] args) {
		
		Set<String> myGoals = new LinkedHashSet<String>();
		
		myGoals.add("Sleep 6 hours");
		myGoals.add("Work 16 hours");
		myGoals.add("Relax and travel for 2 hours");
		//Added again
		myGoals.add("Sleep 6 hours");
		
		System.out.printf(" I have %d Goals\n", myGoals.size());
		
		int counter = 1;
		for(String myGoal : myGoals) {
			System.out.printf("Goal no %d is %s\n",counter, myGoal);
			counter += 1;
		}
	}

}
