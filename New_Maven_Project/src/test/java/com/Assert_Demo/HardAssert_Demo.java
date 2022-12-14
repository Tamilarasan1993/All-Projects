package com.Assert_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_Demo {
	
	
	@Test
	private void assertSoft() {
		String s ="Tom";
		String s1 = "Tam";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s, s1);
		//soft.assertAll(); it will throw Error 
	}
	
	
	@Test(dependsOnMethods = "assertSoft")
	private void assertHArd() {
		String s ="Tom";
		String s1 = "Tam";
		Assert.assertEquals(s, s1);
	}

}
