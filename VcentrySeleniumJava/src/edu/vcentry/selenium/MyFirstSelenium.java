package edu.vcentry.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement q = driver.findElement(By.name("q"));
		q.sendKeys("God help me");
		q.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
}
