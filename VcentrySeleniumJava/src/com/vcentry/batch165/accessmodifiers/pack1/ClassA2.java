package com.vcentry.batch165.accessmodifiers.pack1;

public class ClassA2 {
	public void methodInClassA2() {
		ClassA a2 = new ClassA();
		a2.tryMePublic();
		a2.tryMeProtected();
		//tryMePublic();
	}
	
	public static void main(String args[]) {
		ClassA a1 = new ClassA();
		a1.tryMePackageOrDefault();
	}
}
