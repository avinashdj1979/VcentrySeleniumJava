package com.vcentry.accessmodifiers.pack1;

public class ClassB{
	
	public static void main(String args[]) {
		
		ClassA aObj = new ClassA();
		aObj.getMyNum1(); //public
		aObj.getMyNum2(); // protected
		aObj.getSum(); // default
	}
}
