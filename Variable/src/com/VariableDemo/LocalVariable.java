package com.VariableDemo;

public class LocalVariable {

	public void LV1() {  
     int i = 100;
    System.out.println(i); 
	}
	
	public void LV2() {
     String s = "TOM";         // Initialization
     s = "TOM STS";            // Assign and override the value is in 
     System.out.println(s);
     
	}
	
  public void LV3() {
   char c = '#';
   System.out.println(c);
   
}
  
 public static void main(String[] args) {
	
	 LocalVariable var = new LocalVariable();
	 
	 var.LV1();
	 var.LV2();
	 var.LV3();
 }
}

