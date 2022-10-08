package com.Testng_Attributes;

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

	@Test(dataProvider = "SetOfData")
	private void Datas(String name,String age) {
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		
		
	}

}
