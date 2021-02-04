package edu.vcentry.seljava.class06;

public class ScopeOfVariable {
	
	public static void main(String[] args) {
		
		{
			int scope1Variable = 3;
			System.out.println("Scope 1 variable = " + scope1Variable);
		}
		
		{
			int scope1Variable = 3;
			System.out.println("Scope 1 variable = " + scope1Variable);
		}
		
		//int scope1Variable = 3;
		//System.out.println("Scope 1 variable = " + scope1Variable);
		
		//scope1Variable = 2;
	}
}
