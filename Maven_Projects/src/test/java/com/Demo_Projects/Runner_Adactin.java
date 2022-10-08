package com.Demo_Projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility_Files.Base_Class;

public class Runner_Adactin extends Base_Class{
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver= Browser("Chrome");
		GetUrl("https://adactinhotelapp.com/SearchHotel.php");
		WebElement user = driver.findElement(By.id("username"));
		Sendkeys(user, "Tamil1993");
		WebElement pwd = driver.findElement(By.name("password"));
		Sendkeys(pwd, "P9EHXF");
		WebElement login = driver.findElement(By.name("login"));
		Click(login);
		WebElement location = driver.findElement(By.name("location"));
		SelectValue(location, "Sydney");
		WebElement hotel = driver.findElement(By.id("hotels"));
		SelectValue(hotel, "Hotel Hervey");
		WebElement type = driver.findElement(By.id("room_type"));
		SelectValue(type,"Deluxe");
		WebElement rooms = driver.findElement(By.name("room_nos"));
		SelectValue(rooms,"2");
		Clear(driver.findElement(By.name("datepick_in")));
		Sendkeys(driver.findElement(By.name("datepick_in")), "09/12/2022");
		WebElement Checkout = driver.findElement(By.name("datepick_out"));
		Clear(Checkout);
		Sendkeys(Checkout, "10/12/2022");
		WebElement persons = driver.findElement(By.name("adult_room"));
		SelectIndex(persons,4);
		WebElement child = driver.findElement(By.name("child_room"));
		SelectValue(child, "1");
		Click(driver.findElement(By.name("Submit")));
		Click(driver.findElement(By.name("radiobutton_0")));
		Click(driver.findElement(By.id("continue")));
		Sendkeys(driver.findElement(By.name("first_name")), "Tom");
		Sendkeys(driver.findElement(By.name("last_name")), "Sts");
		Sendkeys(driver.findElement(By.name("address")), "TamilNadu,India");
		Sendkeys(driver.findElement(By.name("cc_num")), "9988776655443322");
		WebElement card = driver.findElement(By.name("cc_type"));
		SelectValue(card, "AMEX");		
		WebElement mon = driver.findElement(By.id("cc_exp_month"));
		SelectValue(mon, "12");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		SelectValue(year, "2022");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		Sendkeys(cvv, "373");
		Click(driver.findElement(By.id("book_now")));
		Thread.sleep(10000);
		ScreenShot("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\snaps\\test.png");
		CLOSE(driver);
}
}
	
	
	

	

