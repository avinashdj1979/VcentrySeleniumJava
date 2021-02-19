package edu.vcentry.classes.class08useofsuper;

public class Citizen {

	public static void main(String[] args) {
		
		Person kumar = new Person();
		
		System.out.println("Age of kumar is: " + kumar.getAge());
		System.out.println("Name of kumar is: " + kumar.getName());
		
		System.out.println("\n*********************************\n");

		/*
		 * When Indian(name, age, pan, aadhaar) is called
		 * super(name, age) calls Person(name, age)
		 */
		Indian radha = new Indian("Radha", 24, "Pan1234", "Aadhaar1234");
		
		System.out.println("Age of radha is: " + radha.getAge());
		System.out.println("PAN of radha is: " + radha.getPan());
		
		System.out.println("\n*********************************\n");
		
		/*
		 * When NorthIndian(name, age, pan, aadhaar) is called
		 * super(name, age, pan, aadhaar) calls Indian(name, age, pan, aadhar)
		 * which in turn calls Person(name, age)
		 */
		
		NorthIndian gautam = new NorthIndian("Gautam", 26, "Pan12345", "Aadhaar12345");
		
		System.out.println("Age of gautam is: " + gautam.getAge());
		System.out.println("PAN of gautam is: " + gautam.getPan());
		
		System.out.println("\n*********************************\n");

	}

}
