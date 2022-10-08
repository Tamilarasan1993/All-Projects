package com.JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//SENDKEYS AND CLICK 
		WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
		//WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		//WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].value='Tamil'",name);
	//	js.executeScript("arguments[0].value='pwd00'", pwd);
		//js.executeScript("arguments[0].click()",login);
		
		//SCROLL UP AND DOWN
//		WebElement help = driver.findElement(By.xpath("//a[.='Help']"));
//		js.executeScript("arguments[0].scrollIntoView()",help);
//		Thread.sleep(5000);
//		js.executeScript("arguments[0].click()",help);
		js.executeScript("arguments[0].setAttribute('Style','Color:Brown')", name);
		//HIGHLIGHTING
		
		
		
		
		
		
		
	
	
	}
}