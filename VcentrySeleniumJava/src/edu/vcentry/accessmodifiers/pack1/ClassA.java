package edu.vcentry.accessmodifiers.pack1;

public class ClassA {

	void printA() {
		System.out.println("printA() is accessed within Package");
	}
	
	protected void printB() {
		System.out.println("printB() is accessed by Classes extending A since it is protected Method");
	}
	
	public void printAandB() {
		System.out.println("PrintAandB() is accessed anywhere because it has public modifier");
	}
}
