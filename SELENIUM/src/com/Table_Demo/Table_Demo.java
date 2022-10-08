package com.Table_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Table_Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> table = driver.findElements(By.name("BookTable"));
		for (WebElement data : table) {
			System.out.println(data.getText());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$ ALL $$$$$$$$$$$$$$$$$$$$$$$$");
		List<WebElement> title = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]"));
		for (WebElement titledata : title) {
			System.out.println(titledata.getText());
		}
		System.out.println("###################### COL #########################");
		List<WebElement> col3 = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[3]"));
		for (WebElement col : col3) {
			System.out.println(col.getText());
		} 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@ ROW @@@@@@@@@@@@@@@@@@@@@@@");
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[4]/td"));
		for(WebElement row4 : row) {
			System.out.println(row4.getText());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&& SpecificCol &&&&&&&&&&&&&&&&&&&&&&");
		List<WebElement> speci = driver.findElements(By.xpath(" //table[@name='BookTable']/tbody/tr/td[4]"));
		for(int i =0;i< speci.size();i++) {
			String text = speci.get(i).getText();
			if (text.equals("300") || text.equals("500") ||text.equals("2000")){
				System.out.println(text);
			}
				
		}
		
		
	}
	
	
	
	
}
