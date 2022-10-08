package com.Practicing;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = scan.next();
		String t ="";
		for(int i =s.length()-1;i>=0;i--) {
			
			t = t+s.charAt(i);
		}
		if (t.equals(s))
		{
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
