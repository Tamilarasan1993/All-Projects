package com.Converting;

import java.util.ArrayList;
import java.util.List;

public class Converting { //Covert String > list and List > String

	public static void main(String[] args) {
		//String > List
		String s = "Tamilarasan";
		System.out.println(s);
		
		int length2 = s.length();
		System.out.println("Before String length :"+length2);
		
		List<Character> li = new ArrayList<Character>();
		for(int i=0;i<=s.length()-1;i++) {
			li.add(s.charAt(i)); //Add String Characters
		}
		System.out.println(li);
		
		//List > String
		String string = li.toString();
		System.out.println(string);
		int length = string.length();
		System.out.println("After String Length :"+length);
	}
}
