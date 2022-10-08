package com.Practicing;

public class Demo1 {
	
	public static void main(String[] args) {
	int x,y;
	 x=20;
	 y=30; 
	 System.out.println("Before Swapping\n");
	 System.out.println("X = "+x);
	 System.out.println("Y = "+y);
	 System.out.println();
	 
	x=x+y;       //Swapping Without "Third" Variable
	y=x-y;
	x=x-y;
	
	 System.out.println("After Swapping\n");
	 System.out.println("X = "+x);
	 System.out.println("Y = "+y);
	}
	
}
                   


      