package myclass.compositon;

public class ResolutionAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resolution r1 = new Resolution(1980, 1260);
		
		Resolution r4 = new Resolution(1000, 700);
		
		Resolution r2 = r1;
		
		Resolution r3 = r2;
		
		r2 = r4;
		
		System.out.println(r3.getHeight());
		
		System.out.println(r2.getHeight());
		
		r3.height = 0;
		
		System.out.println(r1.getHeight());
	}

}
