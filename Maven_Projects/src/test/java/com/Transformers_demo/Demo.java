package com.Transformers_demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(retryAnalyzer = Retry_Analyzer.class)
	private void failTest() {
		String actual ="TAMIL";
		String expected = "Tamil";
		assertEquals(actual, expected);
	}

}
