package edu.vcentry.week1.class06;

public class TenaryOperator {
	public static void main(String[] args) {
		String whatAreYou = "Alien";
		
		boolean isHuman = (whatAreYou == "Human") ? true : false;
		
		String whatAmI = (whatAreYou == "Human") ? "Yes I am" : "No, I am Alien";
		
//		if(whatAreYou == "Human") {
//			isHuman = true;
//		} else {
//			isHuman = false;
//		}
		
		System.out.println("Wha Are You: " + whatAmI  );
		
		System.out.println("I am a Human: " + isHuman);
	}
}
