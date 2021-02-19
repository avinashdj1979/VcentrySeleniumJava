package edu.vcentry.switches;

public class SwitchClass {

	public static void main(String[] args) {
		String month = "Jan";
		int noOfDays = getDays(month);
		System.out.println(String.format("%s has %s days", month, noOfDays));
		
		int days = 31;
		month = getMonths (days);
		System.out.println(String.format("%s has %s days", month, noOfDays));
	}
	
	public static int getDays(String month) {
		int days = 0;
		
		// int, byte, short, char, String 
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
			days = 31;
			break;
		case "Feb":
			days = 28;
			break;
		case "Apr":
		case "Jun":
			days = 30;
			break;
		default:
			days = -1;
			break;
		}
		
		return days;
	}
	
	public static String getMonths(int days) {
		String months ="Invalid";
		
		switch (days) {
		case 31:
			months = "Jan, Mar, May, Jul, Aug, Oct and Dec";
			break;
		case 30:
			months = "Apr, Jun, Sep and Nov";
			break;
		case 28:
			months = "Feb";
			break;
		default:
			months = "Invalid";
			break;
		}
		
		return months;
	}

}
