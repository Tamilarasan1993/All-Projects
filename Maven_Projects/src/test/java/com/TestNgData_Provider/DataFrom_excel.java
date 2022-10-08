package com.TestNgData_Provider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Utility_Files.Base_Class;

public class DataFrom_excel extends Base_Class {
	public static WebDriver driver;
	
	@Test(dataProvider ="DataProvider_ALLDATA",dataProviderClass=TestDataFromExcel.class)
	private void Readerr(String user,String role) {
		
		System.out.println("Username "+user);
		System.out.println("Role" +role);
		
	}
	

}
