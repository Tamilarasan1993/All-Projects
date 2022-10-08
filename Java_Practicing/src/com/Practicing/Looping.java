package com.Practicing;

import java.util.Scanner;     //USING FOR LOOP

public class Looping {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Using For Loop\n");
        System.out.println("Enter your Starting number :");
        int start = sc.nextInt();
		System.out.println("Starting number is :"+start);
		System.out.println("Enter your ending number :");
		int end = sc.nextInt();
		System.out.println("Ending number is :"+end);
		System.out.println("START\n");
		
		int i;
		
		for (i =start;i<=end;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\n");
		System.out.println("End");
	}
}                   
