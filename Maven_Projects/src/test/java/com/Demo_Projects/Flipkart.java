package com.Demo_Projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.POM_Flipkart.Login;
import com.PageObjectManager.Flipkart_POManager;

import Utility_Files.Base_Class;

public class Flipkart extends Base_Class{
	public static WebDriver driver= Base_Class.Browser("Chrome");
	public static Flipkart_POManager manager = new Flipkart_POManager(driver);
	public static void main(String[] args) {
		GetUrl("https://www.flipkart.com/");
		NAVIGATE("refresh");
		Click(manager.getLogin().getClose());
		ACTIONS(manager.getLogin().getElectronics(), "MOveTO");
		ACTIONS(manager.getLogin().getLapacc(), "CLick");
		Click(manager.getLogin().getWifi());
		Click(manager.getLogin().getAdaptor());
		NAVIGATE("refresh");
		Click(manager.getLogin().getAddto());
		Click(manager.getLogin().getRemove());
		Click(manager.getLogin().getConfirmremove());
		//	WindowTO(driver,0);
		
	
	
	
	
	}

}
