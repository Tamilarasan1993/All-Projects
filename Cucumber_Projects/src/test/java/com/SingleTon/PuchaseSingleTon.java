package com.SingleTon;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.Purchase_POManager;

import Utility_Files.Base_Class;

public class PuchaseSingleTon {
	public static WebDriver driver=Base_Class.Browser("chrome");
	
	public static Purchase_POManager manager = new Purchase_POManager(driver);
	
	
	
	
	
	

}
