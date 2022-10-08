package com.Table_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_Loop_TABLE {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		for(int i=0;i<alldata.size();i++) {
			String rowdata = alldata.get(i).getText();
			System.out.println(rowdata);	
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$ ROWDATA $$$$$$$$$$$$$$$$$");
		
		List<WebElement> row= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		int rowSize = row.size();
		System.out.println("ROW SIZE IS "+ rowSize);
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		int colSize = col.size();
		System.out.println("COLSIZE IS "+ colSize);
		System.out.println("%%%%%%%%%%%% SPECIFIC ROW $$$$$$$$$$$$$$");
		
		List<WebElement> parRow = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td"));
		for(int i =0;i<parRow.size();i++) {
			System.out.println(parRow.get(i).getText());
		}
		System.out.println("################## parCOL ######################");
		List<WebElement> parCol = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[3]"));
		for(int i =0;i<parCol.size();i++) {
			System.out.println(parCol.get(i).getText());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ SpeciData in ROW @@@@@@@@@@@@@@@@@@@@@@@@@@");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[4]/td"));
		for(int i =0;i<rowdata.size();i++) {
			String rr = rowdata.get(i).getText();
			if (rr.equals("Animesh") || rr.equals("300") ) {
				System.out.println(rr);
			}
		}
		System.out.println("######################## SpeciData in COL ########################");
		List<WebElement> coldata = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
		for(int i =0;i<coldata.size();i++) {
		String cc = coldata.get(i).getText();
		if(cc.equals("1000") || cc.equals("3000") || cc.equals("2000")) {
			System.out.println(cc);
		}
		}
		System.out.println("&&&&&&&&&&&&&&&&& Specific DATA &&&&&&&&&&&&&&&&&&&&&&");
		List<WebElement> speciData = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));
		for(int i =0;i<speciData.size();i++) {
			String data = speciData.get(i).getText();
			if(data.equals("2000")|| data.equals("Amod") || data.equals("Master In Selenium	") || data.equals("500")) {
				System.out.println(data);
			}	
		}
	}
	
	
	
	
	

}
