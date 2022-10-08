package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Syntax 4 of XPATH //a[text()='textvalue'] 
		
driver.get("https://www.facebook.com/");
WebElement forgotten = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotten.click();		
		
	}
 
}
