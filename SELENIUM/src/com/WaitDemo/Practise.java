package com.WaitDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {
	
	public static WebDriver driver;
	
	public static void implicit() {
		
		driver.get("https://letcode.in/waits");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login =driver.findElement(By.xpath("//a[.='Log in']"));
		login.click();
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		user.sendKeys("Tami");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("tamil");
		WebElement button = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		button.click();
		
		
		WebElement toast = driver.findElement(By.xpath("//div[contains(@id,'toast')]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		wait.until(ExpectedConditions.invisibilityOf(toast));
				}
		
	public static void 	Alert() {
		driver.navigate().back();
		WebElement al = driver.findElement(By.xpath("//button[@id='accept']"));
		al.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

		 implicit();
		 Alert();
		
		
	}

}
