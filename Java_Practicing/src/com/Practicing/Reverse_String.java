package com.Practicing;

public class Reverse_String {
	public static void main(String[] args) {
		
		String s = "Tamil";
		System.out.println(s);
		System.out.println(s.length());
		
		String rev ="";
		char ch ;
		for (int i =0;i<=s.length()-1;i++) {
			ch = s.charAt(i);
			rev = ch+rev;
			
		}
		System.out.println(rev);
		
		
	}

	
	

}
