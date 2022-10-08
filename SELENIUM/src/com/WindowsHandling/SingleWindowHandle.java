package com.WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleWindowHandle {
	public static WebDriver driver;
	
	public static void DownClick() throws AWTException{
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void RightClick(WebDriver d, WebElement e){
		Actions act = new Actions(driver);
		act.contextClick(e).perform();
		}
	public static void main(String[]args) throws AWTException, InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement sellers = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		RightClick(driver, sellers);
		DownClick();
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String>	child = driver.getWindowHandles();
		for(String id : child) {
			if (id.equals(parent)) {
				continue;
		}
			else {
				driver.switchTo().window(id);
				System.out.println("URL  :" +driver.getCurrentUrl());
				System.out.println("Title  :" +driver.getTitle());
			}
			System.out.println(id);
		}
	
	}
}
