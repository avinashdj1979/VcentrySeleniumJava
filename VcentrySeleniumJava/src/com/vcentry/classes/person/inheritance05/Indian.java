package com.vcentry.classes.person.inheritance05;

public class Indian extends Person{

	private String aadhaar;
	private String pan;
	
	public Indian() {
		
	}

	public Indian(String aadhaar, String pan) {
		this.aadhaar = aadhaar;
		this.pan = pan;
	}
	
	public void eats() {
		System.out.printf("%s eats dosa", getName());
	}
}
