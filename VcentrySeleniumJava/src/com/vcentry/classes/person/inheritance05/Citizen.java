package com.vcentry.classes.person.inheritance05;

public class Citizen {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.eats();
		
		
		Indian indian = new Indian();
		indian.eats();
		
	}
	
	private static void decorator() {
		System.out.println("\n******************\n");
	}

}
