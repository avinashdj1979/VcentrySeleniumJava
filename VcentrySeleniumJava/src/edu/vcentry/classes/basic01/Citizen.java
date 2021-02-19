package edu.vcentry.classes.basic01;

public class Citizen {

	public static void main(String[] args) {
		
		Person newPerson = new Person();
		
		newPerson.setName("Kumar");
		newPerson.setAge(24);
		
		System.out.println("Age of new Person is: " + newPerson.getAge());
		System.out.println("Name of Person  is: " + newPerson.getName());

	}

}
