package edu.vcentry.loops;

public class ForLoop {

	public static void main(String[] args) {
		printSeries();
	}

	public static void printSeries() {
//		int firstNum = 0;
//		firstNum = firstNum + 1;
//		System.out.println("Num is: " + firstNum);
//		
//		firstNum += 1;
//		System.out.println("Num is: " + firstNum);
//		
//		firstNum++;
//		System.out.println("Num is: " + firstNum);

		// for(initialzation; condition; increment){ .. }

//		for (int i = 1; i < 101; i = i + 1) {
//
//			if (i <= 5) {
//				continue;
//			}
//
//			if (i > 10) {
//				break;
//			}
//
//			System.out.println("My series : " + i);
//		}
//		System.out.println("I am outside for loop");
		
		int count = 0;
		
		for (int i = 20; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
				count = count + 1;
			}
			
			if(count >= 5) {
				break;
			}
			


		}
	}

}
