package com.Converting;

import java.util.ArrayList;
import java.util.List;

public class Converting { //Covert String > list and List > String

	public static void main(String[] args) {
		//String > List
		String s = "Tamilarasan";
		System.out.println(s);
		int s1 =s.length();
		System.out.println(s1);
		
		List<Character> li = new ArrayList<>();
		
		for(int i =0;i<s.length();i++) {
			li.add(s.charAt(i));
		}
		System.out.println(li);
		
		
	String a= li.toString();
	System.out.println(a.length());
		System.out.println(a);
		
		
		
	}
}
