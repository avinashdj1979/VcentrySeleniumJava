package edu.vcentry.classes.useofthisforconstructor;

public class Citizen {

	public static void main(String[] args) {
		
		/*
		 * In the below case Person() constructor is called.
		 * But in turn it calls Peson(String, int)
		 * So the default value assigned 
		 * 		just born for name
		 * 		0 for age gets printed
		 */
		Person justBorn = new Person();
		
		System.out.println("Age of just born child is: " + justBorn.getAge());
		System.out.println("Name of just born child is: " + justBorn.getName());
		
		System.out.println("\n*****************\n");
	}

}
