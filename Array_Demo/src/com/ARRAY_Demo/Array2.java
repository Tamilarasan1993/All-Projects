package com.ARRAY_Demo;

public class Array2 {

	public static void main(String[] args) {
		
	
	String s ="Tamil is called as Tomsts";
	int length = s.length();
	System.out.println("Length is  :" +length);
	int index = length-1;
	System.out.println("Index is :" +index);
	
	
	for(int i=0;i<=index;i++) {
		System.out.print(s.charAt(i));
	}
	
	}
}
