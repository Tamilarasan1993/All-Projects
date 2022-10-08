package com.Constructor;

public class Demo2 { 
	//Parameterized Constructor
	
	public Demo2(String name) {
System.out.println(name);
	}
public Demo2() {
System.out.println("TomSts");
}
public static void main(String[] args) {
	new Demo2("Tom"); 
	new Demo2();
	
	
}
	
}
