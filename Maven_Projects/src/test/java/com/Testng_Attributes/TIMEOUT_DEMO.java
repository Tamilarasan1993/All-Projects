package com.Testng_Attributes;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility_Files.Base_Class;

public class TIMEOUT_DEMO  extends Base_Class{
public static WebDriver Driver;

@BeforeTest
private void Browserlaunching() {
	driver = Browser("chrome");
}
@Test(timeOut = 30000)
private void facebookLogin() throws InterruptedException {

	GetUrl("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Tamil");
	Thread.sleep(5000);	
	driver.findElement(By.id("pass")).sendKeys("1213456");

}
@AfterTest
private void Loginn() throws InterruptedException {
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//button[@name='login']")).click();
}






	
}
