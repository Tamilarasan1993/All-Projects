package com.TestNgData_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Giver {
	
	@DataProvider
	@Test
	private String[][] SetOfData() {
		String[][] s = {{"Tamil","29"},
						{"Thor","30"},
						{"Tom","10"},
						{"Ferb","18"}};	
		return s;
	}


}
