package edu.vcentry.classes.staticandthiskeyword;

public class StaticAndThisKeyword{

	//static variable
	private static int staticCounter;
	
	//non static counter -> instance variable
	private int instanceCounter;
	
	public StaticAndThisKeyword() {
		
	}
	
	public static void  access () {
		// Cannot use this in the static context, uncomment below line to see the error
		//this.instanceCounter = 5;
		
		// Cannot make static reference to a non static field, uncomment below line to see the error
		//instanceCounter = 5;
	}
	
	public void getInstanceCounter() {
		// this keyword can be allowed to access static variables, but not recommended
		this.staticCounter = 5;
	}

}
