package com.WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandle {
	public static WebDriver driver;
	
	public static void DownClick() throws AWTException{
	Robot ro =new Robot();
	ro.keyPress(KeyEvent.VK_DOWN);
	ro.keyRelease(KeyEvent.VK_DOWN);
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);		
	}
	public static void RightClick(WebDriver d, WebElement e) {
		Actions ac = new Actions(d);
		ac.contextClick(e).perform();
		}
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement sellers = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		WebElement books = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']"));
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']"));
		RightClick(driver, sellers);
		DownClick();
		RightClick(driver, mobiles);
		DownClick();
		RightClick(driver, books);
		DownClick();
//		RightClick(driver, electronics);
//		DownClick();
			//Getting particular tab Title..
		Thread.sleep(4000);
		Set<String> all_id = driver.getWindowHandles();
		 String exp_id="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for(String id : all_id) {
			//System.out.println(driver.switchTo().window(id).getTitle());
			if (driver.switchTo().window(id).getTitle().equals(exp_id)) {	
				System.out.println(driver.getTitle());
				break;
			}

		//		}
//		Thread.sleep(10000);
//	Set<String> all_id = driver.getWindowHandles();
//	List<String> li = new ArrayList<String>(all_id);
//	for(int i =1;i<li.size();i++) {
//		if(i==2) {
//			continue;
//		}
//		driver.switchTo().window(li.get(i));
//		driver.close();
//	}
		
		//	//Set<String>  all_id	=driver.getWindowHandles();
//		List<String> li = new ArrayList<String>(all_id);
//		String ss = li.get(2);
//		driver.switchTo().window(ss);
//	
	}
	
	
	}	

}
