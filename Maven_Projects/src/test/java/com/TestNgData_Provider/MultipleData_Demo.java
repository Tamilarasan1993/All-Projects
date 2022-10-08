package com.TestNgData_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MultipleData_Demo {
	
	@DataProvider
	@Test
	private String[][] SetOfData() {
		String[][] s = {{"Tamil","29"},
						{"Riddle","30"},
						{"Sinchan","10"},
						{"SpongeBob","18"}};	
		return s;
	}
	@Ignore  
	@Test(dataProvider = "SetOfData")//For Same class
	private void WritingData(String student,String age) {
		System.out.println(student);
		System.out.println(age);
	}
	@Test(dataProvider ="SetOfData",dataProviderClass = Data_Giver.class)
	private void readingData(String student,String age) {
		System.out.println(student);
		System.out.println(age);
	}
	
}
