package com.ARRAY_Demo;

public class Array_Sum {
	
	public static void main(String []args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int length = a.length;
		System.out.println("Array Length is :"+length);
		int index = a.length-1;
		System.out.println("Array index is :"+index);
		int sum=0;
		for(int i =0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		double average =sum/length;
		System.out.println("Sum of Array :"+sum);
		System.out.println("Average of Array :"+average);
}

}