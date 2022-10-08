package com.StringDemo;

public class Replace_All {
	
	public static void main(String[]args) {
		
		String s = "%%Tom&&@@** Sts !!199++3";
		
		s = s.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s);
		
		String a="1993++++";
		a=a.replaceAll("[^0-9]","");
		System.out.println(a);
	}

}
