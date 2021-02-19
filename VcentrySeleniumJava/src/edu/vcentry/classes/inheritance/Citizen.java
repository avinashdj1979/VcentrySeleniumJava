package edu.vcentry.classes.inheritance;

public class Citizen {

	public static void main(String[] args) {
		
		Person kumar = new Person();
		
		System.out.println("Age of kumar is: " + kumar.getAge());
		System.out.println("Name of kumar is: " + kumar.getName());

		/*
		 * First Level Inheritance
		 * Indian inherits Person
		 * Indian class have access to all public members of Person.  
		 * Hence we are able to access getAge() of Person class using Indian class Reference
		 */
		Indian radha = new Indian("Radha", 24, "Pan1234", "Aadhaar1234");
		
		System.out.println("Age of radha is: " + radha.getAge());
		System.out.println("PAN of radha is: " + radha.getPan());
		
		/*
		 * Second Level Inheritance (Multi-level inheritance)
		 * Indian inherits Person
		 * NorthIndian inherits Indian
		 * NorthIndian class have access to all public members of Person and Indian class
		 * Hence we are able to access getAge() of Person class and 
		 * getPan() of Indian class using NorthIndian class Reference
		 */
		
		NorthIndian gautam = new NorthIndian("Gautam", 26, "Pan12345", "Aadhaar12345");
		
		System.out.println("Age of gautam is: " + gautam.getAge());
		System.out.println("PAN of gautam is: " + gautam.getPan());

	}

}
