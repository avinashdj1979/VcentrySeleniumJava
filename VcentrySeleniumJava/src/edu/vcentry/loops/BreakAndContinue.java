package edu.vcentry.loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		whileLoop(5);
	}

	public static void whileLoop(int endNum) {

		for (int i = 1; i <= endNum; i++) {
			if (i < 3) {
				continue;
			}
			System.out.print(i + ", ");
			System.out.print(i + ", ");
			System.out.print(i + ", ");

			if (i > 2) {
				break;
			}
		}

		System.out.println("\n**********");

		int i = 1;
		while (i < 10) {

			if (i >= 4) {
				break;
			}

			System.out.println("Before continue " + i);
			System.out.println("Before continue " + i);
			System.out.println("Before continue " + i);
			System.out.println("Before continue " + i);

			if (i < 3) {
				i++;
				continue;
			}

			System.out.println("After Continue" + i);

			System.out.println(i + ", ");
			i++;

			if (i > 4) {
				break;
			}

			System.out.println("After Break" + i);
		}

//		int i = 5;
//		do{
//			System.out.println(i + ", ");
//			i++;
//		}while(i < 5);

	}

}
