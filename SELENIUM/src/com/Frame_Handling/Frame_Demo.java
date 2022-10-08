package com.Frame_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Tags;
import org.openqa.selenium.support.ui.Select;

public class Frame_Demo {
	public static WebDriver driver;
	
//	public  void Tags() {
//	List<WebElement> list = driver.findElements(By.tagName("frame"));
//	System.out.println(list.size());
//	for(int i =0;i<list.size();i++) {
//		System.out.println(list.get(i).getText());
//	}
//	}
	
	
	
	public static void main(String[]args) throws Throwable {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Happy");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement outer = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outer);
		Thread.sleep(2000);
		WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(inner);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Okay");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		drop.click();
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getTagName());
		}
		System.out.println("FOR EACH >>>>>");
		for (WebElement web : list) {
			System.out.println(web.getTagName());
		}
	
	}
			
		
	}
	
	


