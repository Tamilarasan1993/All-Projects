package com.Testng_Demo;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test {
	@BeforeSuite
	private void SetProp() {
		System.out.println("SetProperty");
	}
	
	
	@BeforeTest
	private void Browserlaunch() {
		System.out.println("Browser launch");
	}
	@BeforeClass
	private void UrlLaunch() {
		System.out.println("Url launch");
	}
	@BeforeMethod
	private void AmazonLogin() {
		System.out.println("Login");
	}
	@Test
	private void Mobiles() {
		System.out.println("Mobile Purchase");
	}
	@Test
	private void Toys() {
		System.out.println("Toy purchase");
	}
	@Test
	private void Tshirts() {
		System.out.println("Tshirt purchase");
	}
	@AfterMethod
	private void AmazonLogout() {
		System.out.println("Logout");
	}
	@AfterClass
	private void Homepage() {
		System.out.println("Homepage");
	}	
	@AfterTest
	private void CloseBrowser() {
		System.out.println("Browser close");
	}
	@AfterSuite
	private void Deletecookies() {
		System.out.println("Deletecookies");
	}
	
	
}
