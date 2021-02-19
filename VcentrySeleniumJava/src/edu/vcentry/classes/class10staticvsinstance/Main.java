package edu.vcentry.classes.class10staticvsinstance;

public class Main {

	public static void main(String[] args) {
		staticCounterVsInstanceCounter();
	}
	
	public static void staticCounterVsInstanceCounter() {

		/*
		 * Creating 3 objects for StaticNotStaticVariable class
		 */
		
		StaticNotStaticVariable obj1 = new StaticNotStaticVariable();
		 // static methods called using objects, please note it is called using first object created
		System.out.printf("staticCounter value after first object created is  is %d\n", obj1.getStaticCounter());
		System.out.printf("instanceCounter value after first object created is  is %d\n", obj1.getInstanceCounter());
		printLineBreak();
		
		StaticNotStaticVariable obj2 = new StaticNotStaticVariable();
		 // static methods called using objects, please note it is called using second object created
		System.out.printf("staticCounter value after second object created is  is %d\n", obj2.getStaticCounter());
		System.out.printf("instanceCounter value after first object created is  is %d\n", obj2.getInstanceCounter());
		printLineBreak();

		StaticNotStaticVariable obj3 = new StaticNotStaticVariable();
		 // static and instance method called using objects, please note it is called using third object created
		System.out.printf("staticCounter value after third object created is  is %d \n", obj3.getStaticCounter());
		System.out.printf("instanceCounter value after third object created is  is %d \n", obj3.getInstanceCounter());
		printLineBreak();

		
		/*
		 * instance method cannot be called using class name
		 * we will get the following compile error - Cannot make a static reference to the non-static method
		 * below line is comment - uncomment to see the compile error
		 */
		//int instanceCounterwithClass = StaticNotStaticVariable.getInstanceCounter();
		
		/*
		 * Static methods can be called using class name and objects
		 * But calling using objects does not make any sense, since it does not belong to an object
		 */

		// static methods called using class Name
		int staticCounterWithClassName = StaticNotStaticVariable.getStaticCounter(); 
		System.out.printf("staticCounter's value (using className)  is %d\n", staticCounterWithClassName);
		printLineBreak();
	}
	
	private static void printLineBreak() {
		System.out.println("\n***********************\n");
	}

}
