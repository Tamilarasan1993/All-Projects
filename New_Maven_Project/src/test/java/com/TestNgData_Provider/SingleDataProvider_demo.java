package com.TestNgData_Provider;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleDataProvider_demo {
	
	
	@Parameters({"User","Pwd"})
	@Test                      //Optional doesnot work if the RefName is Valid
	private void FaceBookLogin(@Optional("Tom")String user,String password) {
		System.out.println("Username "+user);
		System.out.println("Password "+password);
		
	}
	
	
	
	
	
	
	

}
