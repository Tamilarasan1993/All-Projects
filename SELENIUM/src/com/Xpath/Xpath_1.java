package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Syntax 1 of XPATH. //input[@attname='attvalue']
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
	user.sendKeys("Tamil1993");
	Thread.sleep(3000);
	WebElement pwd = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	pwd.sendKeys("123456");
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	


}

}
