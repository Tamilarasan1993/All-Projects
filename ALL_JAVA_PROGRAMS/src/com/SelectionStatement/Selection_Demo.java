package com.SelectionStatement;

import java.util.Scanner;

public class Selection_Demo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("** PALLAZO **\n");
		System.out.println("SCREEN 3\n");
		System.out.println("Movie : AVENGERS\n");
		System.out.println("Enter no of Tickets :");
		int tickets = scan.nextInt();
		System.out.println("No of Tickets :"+tickets);
	
		if (tickets>=1 == tickets<11) {
			System.out.println("Tickets Confirmed");
			
		}
		
		else if (tickets<12 ) {
			System.out.println("Seats not Available");
			
		}
		else {
			System.out.println("HouseFull");
		} 
		
	}
	}

