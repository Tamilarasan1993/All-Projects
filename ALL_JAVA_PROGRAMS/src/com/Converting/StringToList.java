package com.Converting;

import java.util.LinkedList;
import java.util.List;

public class StringToList {
	
	public static void main(String[] args) {
		String s1="Tamil Arasan";
		System.out.println(s1);
		
		int length = s1.length();
		System.out.println(length);
		
		List<Object> li = new LinkedList<Object>();
		for(int i=0;i<=s1.length()-1;i++) {
			li.add(s1.charAt(i));	
		}
	System.out.println(li);
	String string = li.toString();
	System.out.println(string);
	}
	
	}

