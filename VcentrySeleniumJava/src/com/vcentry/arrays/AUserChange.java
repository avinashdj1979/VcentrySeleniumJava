package com.vcentry.arrays;

public class AUserChange {

	public static void main(String[] args) {
		A objA = new A();
		A objB = objA;
		
		final A objC = objA;
		
		objC.name = "Raj"; 
		objC.name = "Kumar";
		
		//objC = objB; // Not possible to change the reference as it is final Uncomment to see the compile error.
		
		objA.name = "Rani";
		
		System.out.println("A's name is - " + objA.name);
		
		changeName(objA);
		
		decorator();
		//objB.name = "Gautam";
		
		System.out.println("A's name is - " + objA.name);
	}
	
	private static void decorator() {
		System.out.println("\n*****************");
	}
	
	public static void changeName(A objE) {
		objE.name = "Harry";
	}
}
