package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@class='button is-primary']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hi tom");
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
