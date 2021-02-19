package edu.vcentry.classes.basic02thiskeyword;

public class Person {
	private static String name;
	private int age;
	
	/*
	 * If we create Person(name, age) with parameters
	 * It is our responsibility to explicitly create a Person() constructor with parameters
	 * 
	 * this.name is required when the parameter name and instance variables name is same.
	 * If the parameter is not present and or different name of that of instance variables it is optional
	 */
	
	public Person(String name, int age1) {
		this.name = name;
		// this. is not required as parameter name is age1
		age = age1;
	}

	public String getName() {
		// here this is optional
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public static void setName(String name1) {
		name = name1;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eats() {
		System.out.println(String.format("%s eats anything edible", name));
	}

}
