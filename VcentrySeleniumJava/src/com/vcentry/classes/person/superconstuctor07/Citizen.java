package com.vcentry.classes.person.superconstuctor07;

public class Citizen {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.eats();
		
		decorator();
		
		Indian indian = new Indian();
		indian.eats();
		
		decorator();
		
		Indian indian2 = new Indian("AADHAR1234", "PAN1234");
		
		System.out.println("Indian2's name is " + indian2.getName());
		
		indian2.eats();
		
	}
	
	private static void decorator() {
		System.out.println("\n******************\n");
	}

}
