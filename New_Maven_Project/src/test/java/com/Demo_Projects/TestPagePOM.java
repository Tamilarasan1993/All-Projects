package com.Demo_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PageObjectManager.TestPagePOManager;

import Utility_Files.Base_Class;

public class TestPagePOM extends Base_Class {
	public static WebDriver driver = Base_Class.Browser("Chrome");
	public static TestPagePOManager tpm = new TestPagePOManager(driver);
	
	public static void main(String[] args) {
		GetUrl("https://testautomationpractice.blogspot.com/");
		FRAMES(tpm.getTestPage().getFrame());
		Sendkeys(tpm.getTestPage().getFirstname(), "Tamil");
		Sendkeys(tpm.getTestPage().getLastname(), "Arasan");
		Sendkeys(tpm.getTestPage().getPhone(), "9876543210");
		
		
		
	}
	

}
