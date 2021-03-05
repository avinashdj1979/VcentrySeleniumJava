package edu.vcentry.batch165.basic01;

public class Person {
	
	public String name;
	public int age;
	
	/*
	 *  If a class is created, java creates a default constructor Person()
	 *  Constructors have same name as that of the Class
	 *  Constructors - return type will not be specified
	 *  
	 *  new Constructor() -> Objects
	 */
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
