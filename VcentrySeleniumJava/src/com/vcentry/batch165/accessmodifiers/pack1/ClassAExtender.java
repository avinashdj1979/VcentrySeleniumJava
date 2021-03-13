package com.vcentry.batch165.accessmodifiers.pack1;

public class ClassAExtender extends ClassA{

	public void method() {
		tryMePublic();
		tryMePackageOrDefault();
		tryMeProtected();
	}
	
	public void method2() {
		ClassAExtender extend = new ClassAExtender();
		extend.tryMePackageOrDefault();
		extend.tryMeProtected();
		extend.tryMePublic();
	}
}
