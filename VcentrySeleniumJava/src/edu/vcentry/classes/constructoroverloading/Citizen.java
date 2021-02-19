package edu.vcentry.classes.constructoroverloading;

public class Citizen {

	public static void main(String[] args) {
		
		/*
		 * In the below case default constructor is called
		 * age is set to 0 and name is set to null
		 * Please null is not empty
		 */
		Person kumar = new Person();
		
		System.out.println("Age of kumar is: " + kumar.getAge());
		System.out.println("Name of kumar is: " + kumar.getName());
		
		System.out.println("\n*****************\n");
		
		/*
		 * In the below case parameterized constructor is called
		 * age is set to 0 and name is set to Null
		 */
		Person rani = new Person("Rani", 24);
		
		System.out.println("Age of rani is: " + rani.getAge());
		System.out.println("Name of rani is: " + rani.getName());

		

	}

}
