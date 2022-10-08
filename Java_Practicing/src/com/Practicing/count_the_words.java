package com.Practicing;

import java.util.Scanner;

public class count_the_words {
	
	public static void main(String[] args) {
//		System.out.println("Enter the String");
//		Scanner scan = new Scanner(System.in);
//		String x = scan.nextLine();		
		String s= "ts ts ts ts";
//method 1
		String[] count=s.split(" ");
		for(int i =0;i<count.length;i++) {
			System.out.println(count[i]);
		}
		System.out.println(count.length);
		
//method 2
		int count1 = 1;
		for (int i = 0; i <s.length(); i++) {
			if ((s.charAt(i)==' ')) {
				count1++;
			} 
		}
		System.out.println("String count is "+count1);
	}
}
