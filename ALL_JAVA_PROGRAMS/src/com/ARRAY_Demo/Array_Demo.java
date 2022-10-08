package com.ARRAY_Demo;

public class Array_Demo {

	public static void main(String[] args) {
		int a[] = {30,35,40,45,50,60,70,80,90};
		
		System.out.println("Array Length : "+a.length);
		int index =a.length-1;
		System.out.println("Index :"+index);
		
		
		System.out.println("FOR");
		for(int i=0;i<=index;i++) {
			System.out.println(a[i]);
		}
		System.out.println("FOR EACH");
		for (int i : a) {
			System.out.println(i);
			
		}
		
	}
	
}
