package com.StringDemo;

public class Reverse_String {
	public static void main(String[] args) {
			String s = "Tamilarasan";
			System.out.println("Before reverse :"+s);
			System.out.println("After reverse");
	for(int i = s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	}
}
