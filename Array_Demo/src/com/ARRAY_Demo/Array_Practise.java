package com.ARRAY_Demo;

public class Array_Practise {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,90,10,10};
		int length = a.length;
		System.out.println("Array length :" +length);

		for(int i =0;i<a.length;i++) {
			
			if(a[i]==10) {
				a[i]=100;                //Replacing the values
			}
		System.out.print(" "+a[i]);
		}	
	}
}