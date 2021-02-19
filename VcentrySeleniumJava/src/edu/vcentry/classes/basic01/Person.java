package edu.vcentry.classes.basic01;

public class Person {
	private static String name;
	private int age;
	
	/*
	 * By default, constructor Person() will be created for the class Person()
	 */

	public static String getName() {
		return name;
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
