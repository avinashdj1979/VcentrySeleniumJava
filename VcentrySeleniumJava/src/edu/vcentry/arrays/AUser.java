package edu.vcentry.arrays;

public class AUser {

	public static void main(String[] args) {
		A objA = new A();
		A objB = objA;
		A objC = new A();
		
		objA.age = 10;
		//objA.name = "Kumar";
		
		System.out.println("A's age is - " + objA.age);
		System.out.println("A's name is - " + objA.name);
		decorator();
		objB.age = 20;
		objB.name = "Gautam";
		
		
		
		System.out.println("A's age is - " + objA.age);
		System.out.println("A's name is - " + objA.name);
		decorator();
		
		objA.name = "Rani";
		System.out.println("B's name is - " + objB.name);
		decorator();
		
		objB = objC;
		System.out.println("B's name is - " + objB.name);
		decorator();
		
		objC = objA;
		System.out.println("C's name is - " + objC.name);
		decorator();
		
		int a = 2;
		int b = a;
		
		System.out.println("a's value before modification " + a);
		decorator();
		b =4;
		System.out.println("a's value after modification " + a);
	}
	
	private static void decorator() {
		System.out.println("\n*****************");
	}
	
	public static void changeName(A objE) {
		objE.name = "Harry";
	}
}
