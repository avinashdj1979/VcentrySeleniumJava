package edu.vcentry.methods;

public class KBToMB {
	
	public static void main(String[] args) {
		System.out.println("My Final Converted Result : " + kbToMB(2500));
		
		String myConvResult = kbToMB(5000);
		System.out.println("My Final Converted Result : " + myConvResult);
		
	}
	
	public static String kbToMB(int myLocalKB) {
		
		System.out.println(myTotal(1,4));
		
		// 1MB = 1024 KB
		int myConvertedMB = myLocalKB/ 1024;
		int myRemKB = myLocalKB % 1024;
		
		String result = myConvertedMB + "MB " + myRemKB + "KB";
		return result;
	}
	
	public static String myTotal(final int myNum1, final int myNum2) {
		String result = "Total: " + (myNum1 + myNum2);
		return result;
	}

}
