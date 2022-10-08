package com.Transformers_demo;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class Demo2 {
	@Test
	private void failTest1() {
		String actual ="TAMIL";
		String expected = "Tamil";
		assertEquals(actual, expected);
		//System.out.println("");
	}
	@Test
	private void failTest2() {
		String actual ="Tam";
		String expected = "Tam";
		assertEquals(actual, expected);
	}
	@Test
	private void failTest3() {
		String actual ="TAMIL";
		String expected = "TamilSts";
		assertEquals(actual, expected);
	}
}


