package com.Demo_Projects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility_Files.Base_Class;

public class Facebook extends Base_Class{
		public static WebDriver driver;
		
		//public static Logger log = Logger.getLogger(Facebook.class);
	public static void main(String[] args) throws IOException {
		//PropertyConfigurator.configure("log4j.properties");
		
		
		driver=Browser("Chrome");
		GetUrl("https://www.facebook.com/");
		//log.info("browser launched");
		//
	
	}
	

}
