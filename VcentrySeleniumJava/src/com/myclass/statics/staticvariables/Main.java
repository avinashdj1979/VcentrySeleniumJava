package com.myclass.statics.staticvariables;

public class Main {

	public static void main(String[] args) {
		StaticVsInstanceVariables obj1 = new StaticVsInstanceVariables();
		System.out.println("Instance variable 1 -" + obj1.getInstanceVar());
		System.out.println("Static Variable "  + obj1.getStaticVariable());
		
		StaticVsInstanceVariables obj2= new StaticVsInstanceVariables();
		System.out.println("Instance variable 2 -" + obj2.getInstanceVar());
		System.out.println("Static Variable " + obj2.getStaticVariable());
		
		StaticVsInstanceVariables obj3 = new StaticVsInstanceVariables();
		System.out.println("Instance variable 3 - " + obj3.getInstanceVar());
		System.out.println("Static Variable " + obj3.getStaticVariable());
		
		//Static variable can be using Class
		System.out.println("Static Variable  accessed using Class - " + StaticVsInstanceVariables.staticVariable);
		
		// Static method accessed using Class
		System.out.println("Static Method  accessed using Class - " + StaticVsInstanceVariables.getStaticVariable());
	}

}
