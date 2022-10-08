package com.select;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Demo {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://letcode.in/dropdowns");
//  WebElement url =driver.findElement(By.xpath("//select[@id='fruits']"));
//  Select s1 = new Select(url);
//  List<WebElement> lis =s1.getOptions();
//  for(int i =0;i<lis.size();i++){
//  System.out.println(lis.get(i).getText());
//  }
//  for(WebElement ss : lis){
//  System.out.println(ss.getText());
//  }
  System.out.println("########################################");
  WebElement web =driver.findElement(By.xpath("//select[@id='superheros']"));
  Select s2 = new Select(web);
  List<WebElement> li =s2.getOptions();
  if(s2.isMultiple())
  {
  for(int i=0;i<li.size();i++){
  if(li.get(i).getText().equals("Iron Man") || (li.get(i).getText().equals("Captain America")))
  s2.selectByIndex(i);
  }
  
    List<WebElement> list =s2.getAllSelectedOptions();
  for(WebElement web2 : list){
  System.out.println(web2.getText());
  }
  WebElement first = s2.getFirstSelectedOption();
  System.out.println(first.getText());
  }  
  
}
} 