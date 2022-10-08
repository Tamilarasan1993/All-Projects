package com.absoluteXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ÀbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=ps5+playstation+5&i=electronics&crid=1KH82J6HNHAV5&sprefix=ps5%2Celectronics%2C3350&ref=nb_sb_ss_pltr-ranker-retrain-acsession-opsacceptance_2_3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[7]/div/div/div/div/div/div/div/div[2]/div/span/a/div/img")).click();
		
	}
	
	
	

}
