package com.Testng_Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_Demo {
	
	@Before
	public void Flipkart_Login() {
		System.out.println("Login");
	}
	@Test
	public void Toys() {
		System.out.println("Toy Purchase");
	}
	@Test
	public void Mobiles() {
		System.out.println("Mobile Purchase");
	}
	@Test
	public void Laptops() {
		System.out.println("Laptop Purchase");
	}
	@After
	public void Flipkart_Logout() {
		System.out.println("Logout");
	}
}
