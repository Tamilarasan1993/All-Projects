package com.Testng_Attributes;

import org.testng.annotations.Test;

public class Attributes_Demo {
//	Priority
//	InvocationCount
//	InvocationTimeOut
//	DependsOnMethods
//	AlwaysRun
//	Description
//	ExpectedException
	
	@Test(priority = -1,invocationCount = 2)
	private void Amazon() {
		System.out.println("Amazon");
	}
	@Test(priority = -4,dependsOnMethods = "Myntra",alwaysRun = true)
	private void meesho() {
		System.out.println("Meesho");
	}
	@Test(priority = 0)
	private void Myntra() {
		System.out.println(12/0);
	}
	//if we give invocation count as  what will happen?
	@Test(invocationCount = 0)
	private void Ajio() {
		System.out.println("Ajio");
	}
	//if we did not give invocation count attribute but we use invocation Timeout?
	@Test(invocationTimeOut = 5000)
	private void BigBasket() {
		System.out.println("BB");
	}
	@Test(expectedExceptions = ArithmeticException.class)
	private void TataSky() {
		System.out.println("TataSky");
	}
	@Test(description = "Hello")
	private void India() {
		
	}

}
