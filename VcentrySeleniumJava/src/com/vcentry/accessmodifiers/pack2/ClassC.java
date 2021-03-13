package com.vcentry.accessmodifiers.pack2;

import com.vcentry.accessmodifiers.pack1.ClassA;

public class ClassC {

	public static void main(String args[]) {
		
		ClassA aObj = new ClassA();
		aObj.getMyNum1(); // Public
		//aObj.getMyNum2(); // Protected
		//aObj.getSum(); //Default
	}
}
