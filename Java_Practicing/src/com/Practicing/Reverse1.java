package com.Practicing;

public class Reverse1 {
	public static void main(String[] args) {
			String s="bob";
			System.out.println(System.identityHashCode(s));
			String p="";
			System.out.println(System.identityHashCode(p));
			int length = s.length();
			for(int i =s.length()-1;i>=0;i--) {
				p =p+ 	s.charAt(i);
	}		
			if (s.equals(p)) {
				System.out.println("is palindrome");
			}
			else {
				System.out.println("Not");
			}
	}

		
		
	}

