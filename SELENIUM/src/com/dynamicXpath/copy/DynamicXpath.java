package com.dynamicXpath.copy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@id='username_span']//preceding-sibling::input")).sendKeys("Tamil1993");
		driver.findElement(By.xpath("//tr//descendant::input[@name='password']")).sendKeys("3H0Q3G");
		driver.findElement(By.xpath("//div//following::input")).click();
		WebElement location = driver.findElement(By.xpath("//option//parent::select[@name='location']"));
		Select s1 = new Select(location);
		s1.selectByVisibleText("Melbourne");
		WebElement hotel = driver.findElement(By.xpath("//span//following::select[@id='hotels']"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//span//preceding-sibling::select[@name='room_type']"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Deluxe");
		WebElement no = driver.findElement(By.xpath("//tbody//descendant::select[@name='room_nos']"));
		Select s4 = new Select(no);
		s4.selectByVisibleText("2 - Two");
		WebElement checkin = driver.findElement(By.xpath("//tr//child::input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("09/12/2022");
		WebElement checkout = driver.findElement(By.xpath("//span//preceding-sibling::input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("12/12/2022");
		WebElement adult = driver.findElement(By.xpath("//td//following::select[@id='adult_room']"));
		Select s5 = new Select(adult);
		s5.selectByValue("4");
		WebElement child = driver.findElement(By.xpath("//body//following::select[@name='child_room']"));
		Select s6 =new Select(child);
		s6.selectByValue("0");
		driver.findElement(By.xpath("//script//preceding::input[@type='submit']")).click();
		driver.findElement(By.xpath("//td//child::input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//tr//descendant::input[@type='submit']")).click();
		driver.findElement(By.xpath("//label//preceding-sibling::input[@name='first_name']")).sendKeys("Tom");
		driver.findElement(By.xpath("//tr//preceding::input[@name='last_name']")).sendKeys("Sts");
		driver.findElement(By.xpath("//label//following::textarea")).sendKeys("Thailand");
		driver.findElement(By.xpath("//label//preceding-sibling::input[@name='cc_num']")).sendKeys("9874563212365400");
		WebElement cc = driver.findElement(By.xpath("//td//following::select[@name='cc_type']"));
		Select s8 = new Select(cc);
		s8.selectByValue("MAST");
		WebElement expdate = driver.findElement(By.xpath("//select//following::select[@name='cc_exp_month']"));
		Select s9 = new Select(expdate);
		s9.selectByValue("12");
		WebElement year = driver.findElement(By.xpath("//td//child::select[@name='cc_exp_year']"));
		Select s10 = new Select(year);
		s10.selectByValue("2022");
		driver.findElement(By.xpath("//tr//preceding::input[@name='cc_cvv']")).sendKeys("333");
		driver.findElement(By.xpath("//tr//child::input[@name='book_now']")).click();
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
