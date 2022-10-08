package com.MouseActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouse2 {
	public static void main(String[] args) throws InterruptedException, IOException {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions ac1 = new Actions(driver);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dc = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		ac1.doubleClick(dc).perform();
		WebElement src = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement des = driver.findElement(By.id("droppable"));
		ac1.dragAndDrop(src, des).perform();
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("(//img[@width='100'])[1]"));
		Thread.sleep(2000);
		WebElement trash = driver.findElement(By.id("trash"));
		ac1.dragAndDrop(img, trash).perform();
		WebElement img1 = driver.findElement(By.xpath("(//img[@width='100'])[2]"));
		ac1.dragAndDrop(img1, trash).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.name("speed"));
		Select s1 = new Select(sel);
		s1.selectByIndex(2);
		WebElement sel1 = driver.findElement(By.id("files"));
		Select s2 = new Select(sel1);
		s2.selectByValue("2");
		WebElement sel3 = driver.findElement(By.id("number"));
		Select s3 = new Select(sel3);
		s3.selectByIndex(3);
		Thread.sleep(2000);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src1 = ts.getScreenshotAs(OutputType.FILE);
//		File des1 = new File("C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\snaps\\Test2.png");
//		FileUtils.copyFile(src1, des1);
//		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}