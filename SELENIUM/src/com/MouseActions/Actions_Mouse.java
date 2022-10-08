package com.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {
	public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.get("http://automationpractice.com/index.php");
	Actions act = new Actions(driver);
//	Thread.sleep(2000);
//	
//	WebElement hold = driver.findElement(By.xpath("//a[.='Women']"));
//	act.moveToElement(hold).perform();
//	WebElement sum = driver.findElement(By.xpath("//a[text()='Summer Dresses']"));
//	act.click(sum).perform();
//	Thread.sleep(2000);
	driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
	Thread.sleep(3000);
	WebElement src = driver.findElement(By.id("form:drag_content"));
	Thread.sleep(3000);
	WebElement des = driver.findElement(By.id("form:drop_header"));
	Thread.sleep(3000);
	act.dragAndDrop(src, des).perform();
	Thread.sleep(2000);
	WebElement back = driver.findElement(By.xpath("(//div[@class='card'])[6]"));
	Thread.sleep(2000);
	act.dragAndDrop(src,back).perform();
	
	}
}