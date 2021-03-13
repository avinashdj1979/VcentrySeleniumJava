package com.vcentry.classes.person.c08runtimepolymorphism;

public class Indian extends Person{

	private String aadhaar;
	private String pan;
	
	public Indian() {
		super("Rani", 24);
	}

	public Indian(String aadhaar, String pan) {
		super("Gautam", 22);
		this.aadhaar = aadhaar;
		this.pan = pan;
	}
	
	public Indian(String name, int age, String aadhaar, String pan) {
		super(name, age);
		this.aadhaar = aadhaar;
		this.pan = pan;
	}

	@Override
	public void eats() {
		System.out.printf("%s eats dosa\n", getName());
	}
	
	public void canVote() {
		if(getAge() >= 18) {
			System.out.printf("%s can vote \n", getName());
		} else {
			System.out.printf("%s cannot vote \n", getName());
		}
	}
}
