package com.vcentry.batch165.accessmodifiers.pack2;

import com.vcentry.batch165.accessmodifiers.pack1.ClassA;

public class ClassC {
	public void methodInC() {
		ClassA aobj = new ClassA();
		aobj.tryMePublic();
	}
}
