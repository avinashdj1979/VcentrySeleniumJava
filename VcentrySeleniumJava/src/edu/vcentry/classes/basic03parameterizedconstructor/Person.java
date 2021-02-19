package edu.vcentry.classes.basic03parameterizedconstructor;

public class Person {
	private static String name;
	private int age;
	
	/*
	 * If we create Person(name, age) with parameters
	 * It is our responsibility to explicitly create a Person() constructor with parameters
	 *
	 */
	
	public Person(String name, int age1) {
		this.name = name;
		age = age1;
	}

	public String getName() {
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
