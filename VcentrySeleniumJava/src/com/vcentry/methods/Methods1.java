package com.vcentry.methods;

public class Methods1 {
	
	public static void main(String[] arr) {
//		myFirstMethod();
//		myFirstMethodWithParameter("Keerthana");
		
		//Sum method called
		sum(2 ,3);
	}
	
	public static void myFirstMethod() {
		System.out.println("My First Method");
	}
	
	public static void myFirstMethodWithParameter(String myName) {
		System.out.println("Hello " + myName);
		myFirstMethod();
	}
	
	public static void sum(int myFirstParam, int mySecondParam) {
		System.out.println("The sum is " + myFirstParam + mySecondParam);
	}

}
