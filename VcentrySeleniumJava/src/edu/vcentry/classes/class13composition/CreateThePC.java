package edu.vcentry.classes.class13composition;

public class CreateThePC {

	public static void main(String[] args) {
		
		Dimensions dimension = new Dimensions(20, 20, 5);
		Case theCase = new Case("A1B", "Acer", "240V", dimension);
		
		Resolution resolution = new Resolution(1960, 1280);
		Monitor theMonitor = new Monitor("27 inch curved", "Samsung", 27, resolution);
		
		MotherBoard theMotherBoard = new MotherBoard("Intel A3234", "Intel", 4, 6, "V2.03");
		
		PC thePC = new PC(theMotherBoard, theMonitor, theCase);
		
		thePC.getTheCase().powerOn();
		thePC.getMotherBoard().loadProgram("Windows 10");
		thePC.getMonitor().drawPixel(20, 30, "RED");
		
		System.out.println(String.format("Heigth of case is %d", thePC.getTheCase().getDimensions().getHeigth()));
		
		thePC.drawPixel();
		
		
	}

}
