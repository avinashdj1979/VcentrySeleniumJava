package com.vcentry.composition;

public class CreateYourPC {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1980, 1280);
		Monitor monitor = new Monitor("27 Inch curved", "Samsung", 27, resolution);
		
		Dimension dimension = new Dimension(20, 20, 5);
		Case theCase = new Case("Asus Gaming Case", "Asus", "240v", dimension);
		
		MotherBoard motherBoard = new MotherBoard("Intel A23", "Intel", 2 , 3, "V2.0");
		
		PC thePC = new PC(monitor, motherBoard, theCase);
		
		thePC.getTheCase().powerOn();
		thePC.getMotherboard().loadProgram("Windows 10");
		thePC.getMonitor().drawPixel(3, 5, "Yellow");
		thePC.getTheCase().powerOff();
		
		System.out.println("\n************ using object created");
		
		theCase.powerOn();
		motherBoard.loadProgram("Windows 10");
		monitor.drawPixel(3, 5, "Yellow");
		theCase.powerOff();
		
		System.out.println("\n************ using direct method");
		
		thePC.usePC();
		
		System.out.println("The depth of case is:  " + thePC.getTheCase().getDimension().getDepth());
	}

}
