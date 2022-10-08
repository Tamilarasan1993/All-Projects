package com.looop;

public class Iteration_Demo {
	
	public static void main(String[] args) {
		int a = 99;
		
		System.out.println(a);            // 99                           >> 99
																		  
		System.out.println(--a);          // 1 - 99 = 98                  >> 98

		System.out.println(++a);         //  1 + 98 = 99                  >> 99

		System.out.println(a--);        //  99 - (1) = 99                 >> 99
                  
		System.out.println(a);           // 98                            >> 98

		System.out.println(a++);         // 98 + (1) = 98                 >> 98

		System.out.println(a++ + --a);  // (99+(1)=99)+(1-100=99) = 198   >> 198
 
	    System.out.println(a);           // 99                            >> 99

		System.out.println(++a);         // 1 + 99 = 100                  >> 100
		
		System.out.println(a++ + a);    // (100 + (1) = 100)+101 = 201    >> 201
		

	}
	

}
