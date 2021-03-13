package com.vcentry.batch165.accessmodifiers.pack1;

public class ClassA {
	
	private void tryMePrivate() {
		System.out.println("Class A trymePrivate()");
	}

	protected void tryMeProtected() {
		System.out.println("Class A trymeProtected()");
	}
	
	void tryMePackageOrDefault() {
		System.out.println("Class A trymePackageOrDefault()");
	}
	
	public void tryMePublic() {
		System.out.println("Class A trymePublic()");
	}
}
