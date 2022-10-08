package com.keywords;

public class Computer_teacher extends Teacher{
	
	 byte f = 12;
	 char c = 'A';
	 
  public void Demo() {
	  
	  System.out.println("Class : "+this.f);
	  System.out.println("SEC : "+this.c);
      System.out.println("Designation is : "+super.designation);
      System.out.println("collegename : "+super.collegename);
      super.DOES();
  }	  
  public static void main(String[] args) {
	Computer_teacher ct = new Computer_teacher();
	ct.Demo();
	
  }	
}
	

