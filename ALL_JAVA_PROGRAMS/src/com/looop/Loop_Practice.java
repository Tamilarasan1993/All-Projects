package com.looop;

import java.util.Scanner;

public class Loop_Practice {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Starting point :");
		int Start = scan.nextInt();
		System.out.println("Starting point :"+Start);
		System.out.println("Enter Ending point :");
		int End = scan.nextInt();
		System.out.println("Ending point :"+End);
System.out.println("START\n");   //USING SCANNER in DO WHILE LOOP
   
int i = Start;
do {
	System.out.print(i +" ");
	i++;
} while (i<=End);
        System.out.println();
		System.out.println("END");
	
	}
	}


