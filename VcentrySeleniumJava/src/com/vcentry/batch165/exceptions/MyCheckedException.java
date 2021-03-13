package com.vcentry.batch165.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyCheckedException {

	public static void main(String[] args) {
		File file = new File("C:\\VcentrySeleniumJava\\VcentrySeleniumJava\\src\\com\\vcentry\\batch165\\exceptions\\abc1.txt");
		try {
			FileReader fileReader = new FileReader(file);
			System.out.println("File Found");
		} catch (FileNotFoundException ex) {
			System.out.println("File Not found");
			ex.printStackTrace();
		}
		System.out.println("Outside Try and Catch");
	}

}
