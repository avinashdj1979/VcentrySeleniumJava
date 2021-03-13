package com.vcentry.classes.person.basic03;

public class Citizen {
	
	public static void main(String[] args) {
		
		Person kumar = new Person("Kumar", 23);
		
		System.out.printf("Name is %s \n" , kumar.getName());
		System.out.printf("Age is %d \n" , kumar.getAge());
		
		String name = kumar.getName();
		
		decorator();
		
		Person rani = new Person();
		
		System.out.printf("Name is %s \n" , rani.getName());
		System.out.printf("Age is %d \n" , rani.getAge());
		
	}
	
	private static void decorator() {
		System.out.println("\n******************\n");
	}

}
