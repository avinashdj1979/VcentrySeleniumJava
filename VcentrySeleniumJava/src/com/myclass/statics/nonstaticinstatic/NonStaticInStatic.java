package com.myclass.statics.nonstaticinstatic;

public class NonStaticInStatic {

	public static void main(String args[]) {
		NonStaticInStatic ns = new NonStaticInStatic();
		ns.accessMe();
		staticAccessMe();
	}
	
	public void accessMe() {
		System.out.println("Accessed with Object");
	}
	
	public static void staticAccessMe() {
		System.out.println("Accessed Static without Object");
	}
}
