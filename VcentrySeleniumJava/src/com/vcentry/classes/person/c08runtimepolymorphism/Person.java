package com.vcentry.classes.person.c08runtimepolymorphism;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
//		this.name = "New Born";
//		this.age = 0;
		this("New Born", 0);
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
