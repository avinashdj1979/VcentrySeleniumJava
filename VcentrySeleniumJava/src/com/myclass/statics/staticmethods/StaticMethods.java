package com.myclass.statics.staticmethods;

public class StaticMethods {
	
	private int instanceVar;
	public static int staticVariable;
	
	public StaticMethods() {
		//instanceVar += 1;
		//staticVariable += 1;
	}
	
	public static void staticMethod() {
		//instanceVar += 1;
		//instanceMethod();
		
		anotherStaticMethod();
		staticVariable = staticVariable + 1;
	}
	
	public void instanceMethod() {
		instanceVar += 1;
		staticVariable += 1;
		anotherStaticMethod();
		nonStaticMethod();
	}
	
	public static void anotherStaticMethod() {
		System.out.println("I am static");
	}
	
	public void nonStaticMethod() {
		
	}
}
