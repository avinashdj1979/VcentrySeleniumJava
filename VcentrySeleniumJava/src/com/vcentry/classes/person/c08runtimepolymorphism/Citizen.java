package com.vcentry.classes.person.c08runtimepolymorphism;

public class Citizen {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.eats();
		
		decorator();
		
		Indian indian2 = new Indian("Gautam", 22, "AADHAR1234", "PAN1234");
		
		System.out.println("Indian2's name is " + indian2.getName());
		indian2.eats();
		indian2.canVote();
		
		//person1.canVote();
		
		//RunTime Polymorphism
		
		decorator();
		
		Person person2 = new Indian("Maara", 40, "AADHAR3456", "PAN3456");
		
		/*
		 * Run time type
		 * Compile time type 
		 */
		
		person2.eats();
		
		//person2.canVote();
		
		//Indian indian4 = new Person();
		
		decorator();
		
		Indian person3 = new NorthIndian("Singh", 38, "AADHAR3456", "PAN3456");
		
		person3.eats();
		
		person3.canVote();
	
	}
	
	private static void decorator() {
		System.out.println("\n******************\n");
	}

}
