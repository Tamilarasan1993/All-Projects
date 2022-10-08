package com.Transformers_demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer{

	int start = 1;
	int stop  = 3;
	
	public boolean retry(ITestResult result) {
		
		if(start<=stop) {
			
			start++;
			
			return true;
		}
		
		return false;
	}
	
	
	
	
	

}
