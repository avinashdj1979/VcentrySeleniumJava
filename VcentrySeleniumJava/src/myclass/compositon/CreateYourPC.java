package myclass.compositon;

public class CreateYourPC {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1980, 1260);
		
		Monitor monitor = new Monitor("Samsung", "SMG 27 Inch Curved", 27, resolution);
		
		Dimension dimension = new Dimension(25, 20, 5);
		
		Case theCase = new Case("ASUS", "ASUS123", "240V", dimension); 
		
		Motherboard motherboard = new Motherboard("Intel", "Intel2345", 4,  4, "2.2V");
		
		PC myPC = new PC(motherboard, monitor, theCase);
		
		

	}
	
	/*
	 * 		Resolution resolution = new Resolution(1980, 1260);
		
		System.out.println(resolution.getHeight());
		
		Monitor monitor = new Monitor("Samsung", "SMG 27 Inch Curved", 27, resolution);
		
		System.out.println(monitor.getManufacturer());
		
		Resolution r2 = monitor.getResolution();
		
		System.out.println(r2.getHeight());
		
		System.out.println(monitor.getResolution().getHeight());
		
		Dimension dimension = new Dimension(25, 20, 5);
		
		Case theCase = new Case("ASUS", "ASUS123", "240V", dimension); 
		
		int width = theCase.getDimension().getWidth();
		
		System.out.println("Width is " + width);
		
	 */

}
