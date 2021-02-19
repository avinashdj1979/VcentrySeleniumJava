package edu.vcentry.classes.staticvsinstance;

public class StaticNotStaticVariable{
	
	/*
	 * In the class, we have a static and instance variables
	 * For each object we create for a class, there will be a copy of instance variables
	 * But static variable will be common for all objects, a separate copy will not be created
	 * So, if 3 objects are created,
	 * 	-> staticCounter will be 3, instance counter will be 1 for each copy.
	 * 
	 */

	//static variable
	private static int staticCounter;
	
	//non static counter -> instance variable
	private int instanceCounter;
	
	public StaticNotStaticVariable() {
		staticCounter = staticCounter + 1;
		instanceCounter = instanceCounter + 1;
	}
	
	public static int getStaticCounter() {
		return staticCounter;
	}
	
	public int getInstanceCounter() {
		return instanceCounter;
	}

}
