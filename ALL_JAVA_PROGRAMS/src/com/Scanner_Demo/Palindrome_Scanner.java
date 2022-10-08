package com.Scanner_Demo;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s,reverse="";
		System.out.println("Enter the Number/String to check palindrome :\n");
		s=scan.next();
		int length = s.length();
		
		for(int i =s.length()-1;i>=0;i--) {
			reverse =reverse + s.charAt(i);
		}
		
			if(s.equals(reverse)) {
				System.out.println("Entered String/Number is Palindrome");
			}
			else {
				System.out.println("Entered String/Number is Not a Palindrome");
			}
			}
		}
			
	

