package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Syntax 3 of XPATH using CONTAINS //input[contains(@name,value)]
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		user.sendKeys("Tamil@1993");
		WebElement pwd = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pwd.sendKeys("123456");
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
	}

}
