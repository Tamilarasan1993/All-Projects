package com.TestNgData_Provider;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleDataProvider_demo {
	
	
	@Parameters({"User","Pwd"})
	@Test                     
	private void FaceBookLogin(String user,String password) {
		System.out.println("Username "+user);
		System.out.println("Password "+password);
		
	}
	
	
	
	
	
	
	

}
