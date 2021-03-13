package com.myclass.statics.staticvariables;

public class StaticVsInstanceVariables {
	
	private int instanceVar;
	public static int staticVariable;
	
	public StaticVsInstanceVariables() {
		instanceVar += 1;
		staticVariable += 1;
	}

	public int getInstanceVar() {
		return instanceVar;
	}

	public static int getStaticVariable() {
		return staticVariable;
	}

	
}
