package edu.vcentry.classes.basic04objectworeference;

public class Citizen {

	public static void main(String[] args) {
		
		//Below the line will throw an error when uncommented as there is no constructor with parameters
		//Person newPerson = new Person();
		
		Person newPerson = new Person("Kumar", 24);
		
		System.out.println("Age of new Person is: " + newPerson.getAge());
		System.out.println("Name of new Person is: " + newPerson.getName());
		
		/*
		 * We can also create object without reference,
		 * But it is for one time use and cannot be referenced later
		 * 
		 * In the below lines new Person() is called which creates object.
		 * 
		 * But it has no reference. 
		 * 
		 * Also it is important to understand that line 27 and 29 are not same objects
		 * But but 2 different objects
		 */
		
		new Person("Arjun", 29).eats();
		
		new Person("Gautam", 29).eats();

	}

}
