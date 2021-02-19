package edu.vcentry.classes.runtimepolymorphism;

public class Indian extends Person{
	private String pan;
	private String aadhaar;

	public Indian(String name, int age, String pan, String aadhaar) {
		super(name, age);
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
		System.out.println("eats() method in Indian called");
		System.out.println(String.format("%s eats dosa", getName()));
		System.out.println("\n************************\n");
	}
	
	public void canVote() {
		if(getAge() > 18) {
			System.out.println(String.format("%s can vote", getName()));
		} else {
			System.out.println(String.format("%s is not eligible vote", getName()));
		}
	}
}
