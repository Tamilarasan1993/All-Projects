package com.Frame_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		WebElement frameset = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frameset);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("TAMIL");
		Thread.sleep(2000);
		WebElement inner = driver.findElement(By.xpath("//iframe[@width='650']"));
		driver.switchTo().frame(inner);
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='l4V7wb Fxmcue'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("OKAY");
		driver.findElement(By.xpath("//textarea[@jsname='YPqjbf']")).sendKeys("NOT OKAY");
		driver.findElement(By.xpath("(//span[@class='NPEfkd RveJvd snByac'])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("HIIIII");
	
	
	}
	
	
	

}
