package com.vcentry.classes.person.basic04;

public class Citizen {
	
	public static void main(String[] args) {
		
			System.out.println(new Person().getName());
			
			System.out.println(new Person().getAge());
			
			System.out.println(new Person("Kumar", 23).getName());
			
			System.out.println(new Person("Rani", 24).getAge());
			
			System.out.println(new Person("Rani", 24).getAge());
			
	}
	
	private static void decorator() {
		System.out.println("\n******************\n");
	}

}
