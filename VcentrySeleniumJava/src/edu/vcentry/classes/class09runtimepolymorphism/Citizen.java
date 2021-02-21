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
		
		// This will give compile time error because arun is Person at compile time and Person class don't have canVote() method
		//arun.canVote()
		
		/*
		 * The line number 34 is not allowed
		 * If the compiler allows this to compile
		 * 	Call to indian.canVote() will fail at run time, because during runtime the indian reference in line 34
		 * refers to Person and Person class don't have canVote() method.
		 */
		//Indian indian = new Person();
		//indian.canVote();
		
		
		/*
		 * In the below case eats method of Person is called
		 */
		
		Person someone = new Person("Frank", 23);
		someone.eats();
		
		
	}

}
