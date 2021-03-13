package com.vcentry.batch165.accessmodifiers.pack2;

import com.vcentry.batch165.accessmodifiers.pack1.ClassA;

public class ClassB  extends ClassA{
	
	public void methodInB() {
		tryMePublic();
		tryMeProtected();
	}
	
	public static void main(String arg[]) {
		ClassA aobj = new ClassA();
		aobj.tryMePublic();  
		//aobj.tryMeProtected();
	}

}
