package com.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Purchase {
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Actions ac = new Actions(driver);
		 
		driver.get("http://automationpractice.com/index.php?id_category=9&controller=category");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//div//child::input[@id='email']")).sendKeys("tomsts@1993.com");
		driver.findElement(By.xpath("//div//descendant::input[@id='passwd']")).sendKeys("Tamil1993");
		driver.findElement(By.xpath("//i//ancestor::button[@id='SubmitLogin']")).click();
		WebElement women = driver.findElement(By.xpath("//a[.='Women']"));
		ac.moveToElement(women).perform();
		WebElement casual = driver.findElement(By.xpath("(//ul//descendant::a[text()='Casual Dresses'])[1]"));
		ac.click(casual).perform();
		WebElement dress = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		ac.moveToElement(dress).perform();
		
		WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
		ac.click(quickview).perform();
	
		WebElement outer = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(outer);
		WebElement count = driver.findElement(By.xpath("//input[@name='qty']"));
		count.clear();
		count.sendKeys("2");
		WebElement multi = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s1 = new Select(multi);
		s1.selectByValue("2");
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		driver.findElement(By.xpath("//input[@name='cgv']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		driver.findElement(By.xpath("//p//child::a[@title='Pay by bank wire']")).click();
		driver.findElement(By.xpath("//a//following-sibling::button")).click();
		
		
		
		
	}

}
