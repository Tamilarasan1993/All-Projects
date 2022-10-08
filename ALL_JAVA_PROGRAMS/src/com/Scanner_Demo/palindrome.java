package com.Scanner_Demo;

public class palindrome {
	public static void main(String[] args) {
		
	
	String s="MALAYALAM";
	String t="";
	
	
	for(int i = s.length()-1;i>=0;i--) {
	t=t+s.charAt(i);	
		
	}
if(s.equals(t)) {
	System.out.println("Is Palindrome");
}
else {
	System.out.println("Not Palindrome");
}
	}
}
