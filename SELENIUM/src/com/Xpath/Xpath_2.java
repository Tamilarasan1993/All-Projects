package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_2 {
	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Syntax 2 of XPATH using index //(input[@atname='atvalue'])[1]
	driver.get("https://www.facebook.com/");
	WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	button.click();
	
	
	}
}