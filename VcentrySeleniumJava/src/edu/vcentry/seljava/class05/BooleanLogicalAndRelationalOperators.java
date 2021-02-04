package edu.vcentry.seljava.class05;

public class BooleanLogicalAndRelationalOperators {

	public static void main(String[] args) {
		boolean isHuman = true;
		
		if(!(!(isHuman != false))){ // !(!(true)) ==> !(false) ==> true
			System.out.println("Yes I am a Human");
		}
		
		/*
		 * if(isHuman)
		 * if(!isHuman)
		 * 
		 * if(human == or !=)
		 */
		
		//if(Boolean expression){
		//..
		//}
		
		/*int myNum = 10;
		 * 
		 */
		
		/*if(myNum == 10) {
			System.out.println("My Num is guessed Correctly");
		}*/
		
		/*if(myNum == 9) {
			System.out.println("My Num is guessed Correctly");
		}

			//System.out.println("Yes!!!! You guessed it right");
			
			int maxQtrScore = 90;
			
			int maxHlyScore = 89;
			
			if(!(maxHlyScore == maxQtrScore)) {
				System.out.println("My Half Yearly score is not equal");
			}*/
		
			int historyMark = 79;
			int mathsMark = 79;
			
			if((historyMark >= 80) || (mathsMark >= 80) || ((historyMark + mathsMark) / 2 >= 80)) {
				System.out.println("Distinction");
			}
			
			
		
	}

}
