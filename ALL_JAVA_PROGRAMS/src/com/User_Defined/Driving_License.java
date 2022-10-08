package com.User_Defined;

public class Driving_License {
	
 static int i = 10;
 
 public static void AgeLimit() throws NotFoundException {
	 if(i>=18) {
		 System.out.println("Applicable");
	 }
	 else {	 
	 throw new NotFoundException("Not Valid");
	 }
}
 public static void main(String[] args) throws Exception{
	AgeLimit();
}
}