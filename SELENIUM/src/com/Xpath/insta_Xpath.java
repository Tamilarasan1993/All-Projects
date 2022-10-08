package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_Xpath {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Tamil@1993");
		WebElement pwd = driver.findElement(By.xpath("(//input[@aria-required='true'])[2]"));
		pwd.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//div[contains(@class,'qF0y9')][1]"));
		login.click();

//		WebElement forgotten = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
//		forgotten.click();
	}

}
