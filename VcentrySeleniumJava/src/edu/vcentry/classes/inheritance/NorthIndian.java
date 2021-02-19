package edu.vcentry.classes.inheritance;

public class NorthIndian extends Indian{
	
	public NorthIndian() {
		objCounter += 1;
	}
	
	public NorthIndian(String name, int age, String pan, String aadhaar) {
		super(name, age, pan, aadhaar);
	}
	
	public void eats() {
		System.out.println(String.format("%s eats chappathi", getName()));
	}

}
