package edu.vcentry.classes.class09runtimepolymorphism;

public class Person {
	private static String name;
	private int age;

	public Person(String name1, int age) {
		name = name1;
		this.age = age;
	}

	public Person() {

	}

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
		System.out.println("eats() method in Person called");
		System.out.println(String.format("%s eats anything edible", name));
		System.out.println("\n************************\n");
	}

}
