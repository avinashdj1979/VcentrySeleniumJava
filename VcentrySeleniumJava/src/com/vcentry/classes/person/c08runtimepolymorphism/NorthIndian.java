package com.vcentry.classes.person.c08runtimepolymorphism;

public class NorthIndian extends Indian{

	public NorthIndian() {

	}

	public NorthIndian(String name, int age, String aadhaar, String pan) {
		super(name, age, aadhaar, pan  );

	}

	public void eats() {
		System.out.printf("%s eats chappati\n", getName());
	}
}
