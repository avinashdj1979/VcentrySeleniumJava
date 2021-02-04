package edu.vcentry.seljava.class04;

public class Challenge {
	
	public static void main(String args[]) {
		
		//Step1 -> Multiply 20.0d and 10.0d and store the result
		double step1Result = 20.0d * 11.0d;
		System.out.println("Step 1 Result (20.0d * 11.0d) = " + step1Result);
		
		//Step2 -> Get the remainder when Step1 Result is divided by 20.0d
		double step2Result = step1Result % 20.0d;
		System.out.println("Step 2 Result ==> Step 1 Result % 10.0d ==> (220.0d % 20.0d) = " + step2Result);
		
		//Step3 -> Get the remainder when Step1 Result is divided by 40.0d
		double step3Result = step1Result % 40.0d;
		System.out.println("Step 3 Result ==> Step 1 Result % 40.0d ==> (220.0d % 40.0d) = " + step3Result);
		
		//Step4 -> Take Step3 Result and add 30.0d
		double step4Result = step3Result + 30.0d;
		System.out.println("Step 4 Result ==> Step 3 Result + 30.0d ==> (20.0d + 30.0d) = " + step4Result);
		
		//Step5 -> Add Step3 Result and Step4 Result and Mulitply by 10 --> Wrong Result
		double step5Result = step3Result + step4Result * 10.0d;
		System.out.println("Step 5 Result ==> Step 3 Result + Step 4 Result * 10.0d ==> (20.0d + 50.0d * 10.0d) = " + step5Result);
		
		//Step5 -> Add Step3 Result and Step4 Result and Mulitply by 10 --> Correct Result
		double correctStep5Result = (step3Result + step4Result) * 10.0d;
		System.out.println("Correct Step5 Result ==> Step 3 Result + Step 4 Result * 10.0d ==> ((20.0d + 50.0d) * 10.0d) = " + correctStep5Result);
		
		//Operator Precedence
		// ()- brackets take higher precedence than +,-,*,/,% operator.
		
		int myShortCutInt = 5;
		
		myShortCutInt %= 2; // myShortCutInt = myShortCutInt % 2;
		
		System.out.println(myShortCutInt);
		
	}

}
