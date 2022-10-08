package com.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args)  {
		//System.setProperty(String Key,String Value) 
		//KEY-->Path, Value -->location of Browser.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		// Tool  obj = new browser();
		//Interface obj = new Class(); ===> UPCASTING.
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("https://www.instagram.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().getSize();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		
		
	}

}
    