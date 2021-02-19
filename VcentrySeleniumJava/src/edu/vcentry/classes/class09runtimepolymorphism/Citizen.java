package edu.vcentry.classes.class09runtimepolymorphism;

public class Citizen {

	public static void main(String[] args) {
		
		Person arun = new Indian("Arun", 21, "PAN1234", "AADHAAR1234");
		
		/*
		 * Compile Time Type is the type of the reference variable during compile time
		 * Run Time type is what the reference act as during run time, so it determines what gets called
		 * In line no 7,
		 * 		compile time type of arun is Person
		 * 		runtime type of arun is Indian
		 * 
		 * Both Person and Indian method has eats() method, check out what is called when eats() is called
		 * with arun reference.
		 * 
		 * eats() method in Indian is called
		 * 
		 */
		
		arun.eats();
		
		/*
		 * In the below case eats method of Person is called
		 */
		
		Person someone = new Person("Frank", 23);
		someone.eats();
	}

}
