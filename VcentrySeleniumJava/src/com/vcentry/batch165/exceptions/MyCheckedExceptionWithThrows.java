package com.vcentry.batch165.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyCheckedExceptionWithThrows {

	public static void main(String[] args) {
		try {
			call1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Handled in main()");
	}
	
	public static void call1() throws FileNotFoundException {
		call2();
	}
	
	public static void call2() throws FileNotFoundException {
		File file = new File("C:\\VcentrySeleniumJava\\VcentrySeleniumJava\\src\\com\\vcentry\\batch165\\exceptions\\abc1.txt");
		FileReader fileReader = new FileReader(file);
		System.out.println("File Found");
		System.out.println("Outside Try and Catch");
	}

}
