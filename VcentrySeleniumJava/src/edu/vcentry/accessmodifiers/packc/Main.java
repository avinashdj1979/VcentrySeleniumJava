package edu.vcentry.accessmodifiers.packc;

import edu.vcentry.accessmodifiers.pack1.ClassA;
import edu.vcentry.accessmodifiers.pack2.ClassB;

public class Main extends ClassA{

	public static void main(String[] args) {
		ClassA aObj = new ClassA();
		ClassB bObj = new ClassB();
		Main main = new Main();
		
		//aObj.printB(); 
		/*Protected method Cannot be accessed outside the package with aObj.
		 * Only Public method can be accessed with Object outside the package.
		 * But can be accessed using Sub Class Object.
		 * Say main is the object of Class Main. which is extending ClassA
		 * 	main.printB(); // Can be accessed by SubClass Object
		 * In other words Main class can access the inherited method within the class not outside of it.
		 */
		main.printB(); // Can be accessed by SubClass Object
		//bObj.printC(); Methods with package access cannot be accessed outside the package.
		//bObj.printB(); Not accessible in Main. But accessible in ClassB's main method

	}

	public void accessPrintB() {
		printB();
	}
}
