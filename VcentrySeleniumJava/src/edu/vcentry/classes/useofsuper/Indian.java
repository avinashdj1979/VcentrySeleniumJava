package edu.vcentry.classes.useofsuper;

public class Indian extends Person{
	private String pan;
	private String aadhaar;

	/*
	 * Use of super(name, age) in line number 12 calls the super class constructor
	 * Person(name, age) and sets the value passed in parameter name and age.
	 * 
	 * Important note 
	 * 1. Use of super() should be the first statement in constructor call
	 * 2. Also use of this() should be first statement in the  , refer useofthisforconstructor package
	 * So, this() and super() cannot be used together.
	 */
	public Indian(String name, int age, String pan, String aadhaar) {
		super(name, age);
		System.out.println("Indian(name,age,pan,aadhaar) is called");
		this.pan = pan;
		this.aadhaar = aadhaar;
	}

	public Indian() {
		this("No Name", 23, "NA", "NA");
	}

	public String getPan() {
		return pan;
	}

	public String getAadhaar() {
		return aadhaar;
	}
	
	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public void eats() {
		System.out.println(String.format("%s eats dosa", getName()));
	}
	
	public void canVote() {
		if(getAge() > 18) {
			System.out.println(String.format("%s can vote", getName()));
		} else {
			System.out.println(String.format("%s is not eligible vote", getName()));
		}
	}
}
