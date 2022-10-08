package com.Testng_Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Utility_Files.Base_Class;

public class Parallel_Test extends Base_Class{
	public static WebDriver driver;
	
	
	@Test
	private void Userdata() {
		driver= Base_Class.Browser("chrome");
		GetUrl("https://www.facebook.com/");
	}
	@Test
	private void gmail() {
		driver= Base_Class.Browser("chrome");
		GetUrl("https://www.gmail.com");
	}	
	
}
