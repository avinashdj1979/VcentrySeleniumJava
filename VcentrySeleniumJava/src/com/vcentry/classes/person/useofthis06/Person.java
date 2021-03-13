package com.vcentry.classes.person.useofthis06;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		/*
		 * We are calling the parameterized constructor using this(name,age)
		 * this() should be first statement in the constructor
		 */
		this("New Born", 0);
		System.out.println("Hi I am in Person constructor");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eats() {
		System.out.printf("%s eats anything edible\n", getName());
	}

}
