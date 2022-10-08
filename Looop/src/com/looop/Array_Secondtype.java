package com.looop;

public class Array_Secondtype {

	public static void main(String[]args) {
		
		int a[] = {10,20,30,55,66};
		System.out.println("For loop");
		for (int i = 0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("For each");
		for(int i : a) {
		System.out.println(i);
		
		}
	}
}
