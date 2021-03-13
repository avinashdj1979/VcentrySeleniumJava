package myclass.compositon;

public class Main {

	public static void main(String[] args) {
		
		B b1 = new B(5);
		
		b1.getC(); // 5
		
		A a2 = new A(2, b1);
		
		a2.getA();
		
		B b2 = a2.getbObj();
		
		b2.getC();
		
		System.out.println(b2.getC());
		System.out.println(a2.getbObj().getC());  // b1.getC();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		A a = new A(2, b1);
		
		a.getbObj();
		
		a.getA();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int localA = obj1.getA();
		System.out.printf("My Local A is %d\n", localA);
		
		int c = obj1.getbObj().getC();
		
		System.out.println("C called using A - " + c );
		
		
		B b1 = new B(5);
		System.out.printf("B1.getC() is %d\n", b1.getC());*/
	}

}
