package com.Frame_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFRAME {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("FRAME1");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("FRAME2");
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("FRAME4");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("FRAME3");
		WebElement inner = driver.findElement(By.xpath("//iframe[@height='350']"));
		driver.switchTo().frame(inner);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]")).click();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']"));
		Actions ac = new Actions(driver);
		ac.click(drop).perform();
		WebElement yes = driver.findElement(By.xpath("(//span[@class='vRMGwf oJeWuf'])[3]"));
		ac.click(yes).perform();
		driver.findElement(By.xpath("(//span[@class='l4V7wb Fxmcue'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("SUPER");
		driver.findElement(By.xpath("//textarea[@jsname='YPqjbf']")).sendKeys("WELCOME TO JAVA");
		driver.findElement(By.xpath("(//span[@class='l4V7wb Fxmcue'])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
