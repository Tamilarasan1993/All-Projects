package com.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authentication_Alert {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("Disable-Notifications");
	
	WebDriver driver = new ChromeDriver();
	
	//http://the-internet.herokuapp.com/basic_auth
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	
}
}