package com.vcentry.classes.person.basic01;

public class Citizen {
	
	public static void main(String[] args) {
		
		Person kumar = new Person();
		
		System.out.printf("Name is %s \n" , kumar.getName());
		System.out.printf("Age is %d \n" , kumar.getAge());
		
		System.out.println("\n***************\n");
		
		kumar.setName("Ravi Kumar");
		kumar.setAge(21);
		
		System.out.printf("Name is %s \n" , kumar.getName());
		System.out.printf("Age is %d \n" , kumar.getAge());
	}

}
