package com.vcentry.classes.person.basic02;

public class Citizen {
	
	public static void main(String[] args) {
		
		Person kumar = new Person("Kumar", 23);
		
		System.out.printf("Name is %s \n" , kumar.getName());
		System.out.printf("Age is %d \n" , kumar.getAge());
		
	}

}
