package edu.vcentry.classes.staticmethods;

public class Main {

	public static void main(String[] args) {
		StaticMethodsAccessibilty obj1 = new StaticMethodsAccessibilty();
		
		obj1.nonStaticMethod();
		
		System.out.println("\n***********************\n");
		
		StaticMethodsAccessibilty.staticMethod();

	}

}
