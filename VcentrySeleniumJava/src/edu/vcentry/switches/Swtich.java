package edu.vcentry.switches;


public class Swtich {

	public static void main(String[] args) {
		String month = "FEB";
		int days = findDaysInaMonthUsingSwitch(month);
		System.out.println("Number of days in a " + month + ": " +days);
	}
	
	public static int findDaysInaMonthUsingIf(final String month) {
		if(month.equals("Jan") || month.equals("Mar")) {
			return 31;
		} else if (month.equals("Feb")) {
			return 28;
		} 
		return 30;
	}
	
	public static int findDaysInaMonthUsingSwitch(final String month) {
		int days = 0;
		switch(month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
			days = 31;
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			days = 30;
			break;
		case "Feb":
			days = 28;
			break;
		default:
			days = -1;
		}
		
		return days;
	}
	

}
