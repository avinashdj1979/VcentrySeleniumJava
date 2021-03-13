package com.vcentry.classes.person.inheritance05;

public class NorthIndian {

	private String name;
	private int age;
	private String aadhaar;
	private String pan;

	public NorthIndian() {

	}

	public NorthIndian(String name, int age, String aadhaar, String pan) {
		this.name = name;
		this.age = age;
		this.aadhaar = aadhaar;
		this.pan = pan;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public String getPan() {
		return pan;
	}

}
