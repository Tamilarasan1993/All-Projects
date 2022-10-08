package com.WaitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Wait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("TAMIL");
		
		
		

		
		
		
		
	}
	

}
