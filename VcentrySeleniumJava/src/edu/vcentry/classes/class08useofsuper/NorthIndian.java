package edu.vcentry.classes.class08useofsuper;

public class NorthIndian extends Indian{
	
	public NorthIndian() {
		
	}
	
	public NorthIndian(String name, int age, String pan, String aadhaar) {
		super(name, age, pan, aadhaar);
		System.out.println("NorthIndian(name, age, pan, aadhar) is called");
	}
	
	public void eats() {
		System.out.println(String.format("%s eats chappathi", getName()));
	}

}
