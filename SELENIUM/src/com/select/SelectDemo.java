package com.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		link.click();
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s1= new Select(date);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s1.getOptions();
		for(int i =0;i<options.size();i++) 
		System.out.println(date.getText());

		
	}

}
