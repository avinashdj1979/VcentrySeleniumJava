package edu.vcentry.interfaces;

public class Main {
	public static void main(String[] args) {
		Sports cricket = new Cricket();

		printClassName(cricket);
		decorator();
		System.out.printf("Is it an olympic sport? %b\n", cricket.isOlympicSport());
		cricket.type();
		cricket.tie();
		
		//s.PrizeMoney(); // Compile error - Static methods in an interface can be accessed only by Interface Name.

		Sports tennis = new Tennis();
		
		printClassName(tennis);
		decorator();
		System.out.printf("Is it an olympic sport? %b\n", tennis.isOlympicSport());
		/*
		 * type() is a default method, which is overridden in Tennis and not in Cricket
		 * It is not mandatory to ovverride default method.
		 */
		tennis.type(); 
		tennis.tie();
		

		decorator();
		Sports.PrizeMoney();
		/*
		 *  price money is undefined in Sports though cricket has a static method. it cannot be accessed.
		 *  static method cannot be overidden.
		 *  It will considered as a method of Class and not Interface.
		 */
		//cricket.prizeMoney();  
		
		decorator();
		Cricket cricket2 = new Cricket();
		printClassName(cricket2);
		decorator();
		cricket2.tie();
		
		decorator();
		Tennis tennis1 = new Tennis();
		printClassName(tennis1);
		decorator();
		System.out.println("Grandslam tournaments are:");
		for(String major : tennis1.majors()) {
			System.out.println(major);
		}
		
	}
	
	private static void decorator() {
		System.out.println("**************");
	}
	
	private static void printClassName(Object obj) {
		// Gives the name of the class (object) reference variable points to.
		// Cricket class object is sent and Parameter is Object
		// Object is the super Class of all the Class created
		System.out.println(obj.getClass().getSimpleName()); 
	}
}
