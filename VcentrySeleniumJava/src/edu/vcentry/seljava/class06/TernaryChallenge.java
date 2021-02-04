package edu.vmetry.seljava.class06;

public class TernaryChallenge {

	public static void main(String[] args) {
		String grade = "FC";
		String altGrade = "D";
		int marks = ((grade == "D") || (altGrade == "D")) ? 80 : 60;
		System.out.println("My mark is Greater than or "+ "equal to " + marks);
	}
}
