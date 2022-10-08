package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement ss = driver.findElement(By.xpath("(//yt-icon[contains(@class,'style')])[13]"));
		ss.click();
		
TakesScreenshot	js = (TakesScreenshot) driver;
	File Demo = js.getScreenshotAs(OutputType.FILE);
	File data = new File("C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\snaps\\Test.png");
	FileUtils.copyFile(Demo,data);
	}
}
