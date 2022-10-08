package com.looop;

public class Looping_Demo {
	
	public static void main(String[] args) {
		
		int i,j;
		System.out.println("START\n");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");		
			}
			System.out.println();
		}
		
		System.out.println("\nEND");
	}

}
