package edu.vcentry.classes.basics03parameterizedconstructor;

public class Citizen {

	public static void main(String[] args) {
		
		//Below the line will throw an error when uncommented as there is no constructor with parameters
		//Person newPerson = new Person();
		
		Person newPerson = new Person("Kumar", 24);
		
		System.out.println("Age of new Person is: " + newPerson.getAge());
		System.out.println("Name of new Person is: " + newPerson.getName());

	}

}
