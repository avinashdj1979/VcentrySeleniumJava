package edu.vcentry.classes.class11staticmethods;

public class StaticMethodsAccessibilty{
	
	/*
	 * static methods can access only Static members (both variables and methods)
	 * non static methods can access static and not static members (both variables and methods)
	 * 
	 */

	//static variable
	private static int staticCounter;
	
	//non static counter -> instance variable
	private int instanceCounter;
	
	public StaticMethodsAccessibilty() {
		
	}
	
	public static void  staticMethod() {
		// Cannot access Instance variable, uncomment below line to see the error
		//instanceCounter = instanceCounter + 1;
		
		// Cannot call non static method directly - we will how to call in next session, 
		// uncomment below line to see the error
		//nonStaticMethod();
		
		// Static variable can be accessed using static method
		staticCounter += 1;
		System.out.printf("Static counter is called by static method and incremented to %d\n",  staticCounter);
		
		//Static methods can be accessed using static method
		anotherStaticMethod();
	}
	
	public void nonStaticMethod() {
		System.out.println("I am a non static method");
		
		//Can access static variable
		staticCounter += 1;
		System.out.printf("Static counter is called by non static method and incremented to %d\n", staticCounter);
		
		//Can access static method
		staticMethodCalledByNotStaticMethod();
	}
	
	public static void anotherStaticMethod() {
		System.out.println("I am another static Mehod called by a static method");
	}
	
	public static void staticMethodCalledByNotStaticMethod() {
		System.out.println("I am static Mehod called by a non static method");
	}

}
