package edu.vcentry.classes.class07useofthisforconstructor;

public class Person {
	private static String name;
	private int age;
	
	/*
	 * this() is used to called overloaded constructor
	 * in line 18 this("Just Born", 0 ) calls Person(String, int)
	 * 
	 * ***** Important to note while using this() *******
	 * this() should be the first statement in the constructor
	 * uncomment the line 17 to see the error
	 */
	
	public Person() {
		//System.out.println("I am called before this() and it is not allowed.");
		this("Just Born", 0);
	}

	public Person(String name1, int age) {
		System.out.println("I am called when person() is called using this()");
		name = name1;
		this.age = age;
	}

	/*
	 * getName(), setName() and getAge() and setAge() are 
	 * 		defined by us and not system generated
	 * 		these methods are optional and not mandatory
	 */
	public static String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void setName(String name1) {
		name = name1;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eats() {
		System.out.println(String.format("%s eats anything edible", name));
	}

}
