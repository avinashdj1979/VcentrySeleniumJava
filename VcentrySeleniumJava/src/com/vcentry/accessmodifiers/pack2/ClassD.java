package com.vcentry.accessmodifiers.pack2;

import com.vcentry.accessmodifiers.pack1.ClassA;

public class ClassD  extends ClassA{
	
	public static void main(String args[]) {
		
		ClassA aObj = new ClassA();
		aObj.getMyNum1(); //public
	}
	
	public void myNum() {
		getMyNum1(); //public
		getMyNum2(); //protected can be accessed because it is extending class A.
		//getSum(); // This cannot as the access modifier is default/package
	}
}
