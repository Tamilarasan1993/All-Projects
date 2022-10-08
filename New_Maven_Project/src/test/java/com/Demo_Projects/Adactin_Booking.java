package com.Demo_Projects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Adactin_Booking {	

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\Demo_Projects\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.id("username")).sendKeys("Tamil1993");
	driver.findElement(By.name("password")).sendKeys("P9EHXF");
	driver.findElement(By.name("login")).click();
	WebElement location = driver.findElement(By.name("location"));
	Select s1 = new Select(location);
	s1.selectByValue("Sydney");
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select s2 = new Select(hotel);
	s2.selectByVisibleText("Hotel Hervey");
	WebElement type = driver.findElement(By.id("room_type"));
	Select s3 = new Select(type);
	s3.selectByIndex(3);
	WebElement rooms = driver.findElement(By.name("room_nos"));
	Select s4 = new Select(rooms);
	s4.selectByVisibleText("2 - Two");
	WebElement Checkin = driver.findElement(By.name("datepick_in"));
	Checkin.clear();
	Checkin.sendKeys("09/12/2022");
	WebElement Checkout = driver.findElement(By.name("datepick_out"));
	Checkout.clear();
	Checkout.sendKeys("10/12/2022");
	WebElement persons = driver.findElement(By.name("adult_room"));
	Select s5 = new Select(persons);
	s5.selectByValue("4");
	WebElement child = driver.findElement(By.name("child_room"));
	Select s6 = new Select(child);
	s6.selectByValue("1");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.name("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("first_name")).sendKeys("Tom");
	driver.findElement(By.name("last_name")).sendKeys("Sts");
	driver.findElement(By.name("address")).sendKeys("TamilNadu,India");
	driver.findElement(By.name("cc_num")).sendKeys("9988776655443322");
	WebElement card = driver.findElement(By.name("cc_type"));
	Select s7 = new Select(card);
	s7.selectByValue("AMEX");
	WebElement mon = driver.findElement(By.id("cc_exp_month"));
	Select s8 = new Select(mon);
	s8.selectByValue("12");
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select s9 = new Select(year);
	s9.selectByValue("2022");
	WebElement cvv = driver.findElement(By.name("cc_cvv"));
	cvv.sendKeys("373");
	driver.findElement(By.id("book_now")).click();
	
	Thread.sleep(10000);
	TakesScreenshot ss = (TakesScreenshot) driver;
	File source = ss.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Demo_Projects\\snaps\\Hotel.png");
	FileUtils.copyFile(source, destination);	
}

}


