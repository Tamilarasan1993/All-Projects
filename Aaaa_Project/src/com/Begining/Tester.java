package com.Begining;

public class Tester {
	
	 Tester() {
		 System.out.println("Constructor");
	}
	 private void Display() {
System.out.println("Display Method");
	}
	 {
		 System.out.println("Instance Block");
	 }
	 static {
		 System.out.println("Static Block");
	 }
	 public static void main(String[] args) {
		Tester t = new Tester();
		t.Display();
		
	}
}
