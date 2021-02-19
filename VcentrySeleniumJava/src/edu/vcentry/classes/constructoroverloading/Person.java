package edu.vcentry.classes.constructoroverloading;

public class Person {
	private static String name;
	private int age;
	
	public Person() {

	}

	public Person(String name1, int age) {
		name = name1;
		this.age = age;
	}

	/*
	 * getName(), setName() and getAge() and setAge() are 
	 * 		defined by us and not system generated
	 * 		these methods are optional and not mandatory
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
