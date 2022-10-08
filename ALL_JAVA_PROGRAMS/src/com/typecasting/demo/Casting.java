package com.typecasting.demo;

public class Casting {
	public static void main(String[] args) {
	
	//Widening
		
	int i = 12345678; //Initialization
	
	long l = i;
	System.out.println(l);
	
	
	//Narrowing
	
byte s = (byte) l;
	System.out.println(s);
	
	}
}
