package edu.vcentry.classes.basic02thiskeyword;

public class Citizen {

	public static void main(String[] args) {
		
		Person newPerson = new Person("Kumar", 24);
		
		System.out.println("Age of new Person is: " + newPerson.getAge());
		System.out.println("Name of new Person is: " + newPerson.getName());

	}

}
