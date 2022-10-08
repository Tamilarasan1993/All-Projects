package com.OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Thiruchitrambalam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label=\"Search\"])[1]")).click();
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("(//a[@id='video-title'])[2]"));
		Thread.sleep(2000);
		click.click();
		Thread.sleep(21000);
		driver.findElement(By.xpath("(//button[contains(@class,'ytp-ad')])[4]")).click();
	}

}
