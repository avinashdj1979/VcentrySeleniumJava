package edu.vcentry.accessmodifiers.packc;

import edu.vcentry.accessmodifiers.pack1.ClassA;
import edu.vcentry.accessmodifiers.pack2.ClassB;

public class Main extends ClassA{

	public static void main(String[] args) {
		ClassA aObj = new ClassA();
		ClassB bObj = new ClassB();
		Main main = new Main();
		
		//aObj.printB(); Protected method Cannot be accessed outside the package.  Only Public method can be accessed with Object outside the package.
		//bObj.printC(); Methods with package access cannot be accessed outside the package.
		bObj.printD();
		main.printB(); // Can be accessed by SubClass Object
	}

	public void accessPrintB() {
		printB();
	}
}
