package com.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		//1
		WebElement dd = driver.findElement(By.id("fruits"));
		Select s1 =new Select(dd);
		s1.selectByValue("2");
		System.out.println(s1.isMultiple());
		List<WebElement> lists = s1.getOptions();
		for (WebElement li : lists) 
			System.out.print(" "+li.getText());
		System.out.println();
		//2
		WebElement dd1 = driver.findElement(By.id("superheros"));
		Select s2 =new Select(dd1);
		System.out.println(s2.isMultiple());
		s2.selectByValue("ca");
		s2.selectByValue("bt");
		s2.selectByValue("wv");
		s2.selectByValue("im");
		WebElement first = s2.getFirstSelectedOption();
		System.out.print(first.getText()+" ");
		System.out.println();
		List<WebElement> all = s2.getAllSelectedOptions();
		for (WebElement all2 : all)
			System.out.print(all2.getText()+" ");
		System.out.println();
	
		}
		//3
//		WebElement dd3 = driver.findElement(By.id("lang"));
//		Select s3 = new Select(dd3);
//		System.out.println(s3.isMultiple());
//		s3.selectByValue("java");
//		List<WebElement> op2 = s3.getOptions();
//		for (WebElement li3 : op2)
//		System.out.print(" "+li3.getText());
//		System.out.println();
//		//4
//		WebElement dd4 = driver.findElement(By.id("country"));
//		Select s4 = new Select(dd4);
//		s4.selectByValue("Brazil");
//		System.out.println(s4.isMultiple());
//		List<WebElement> op3 = s4.getOptions();
//		for (WebElement li4 : op3)
//			System.out.print(" "+li4.getText());
//		System.out.println();
	


}