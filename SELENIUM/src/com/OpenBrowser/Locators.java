package com.OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("Avengers@2022");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("Cap@1933");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
