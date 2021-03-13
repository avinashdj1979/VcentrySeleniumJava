package edu.vcentry.accessmodifiers.pack2;

import edu.vcentry.accessmodifiers.pack1.ClassA;

public class ClassB extends ClassA{
	
	void printC() {
		//printA(); - Print A is not Visible, since the access specifier is default
		System.out.println("printC() is accessed within Package");
	}
	
	public void printD() {
		printB(); // Even though it is not in the same package B is a sub class of A hence Accessible.
		System.out.println("printD() is accessed outside Package. Public");
	}
	
	public static void main(String args[]) {
		ClassA aobj = new ClassA();
		ClassB bobj = new ClassB();
		ClassA bobj2 = new ClassB();
	}
}
