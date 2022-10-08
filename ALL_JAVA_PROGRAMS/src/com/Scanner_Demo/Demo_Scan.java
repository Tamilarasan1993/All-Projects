package com.Scanner_Demo;
import java.util.Scanner;
public class Demo_Scan {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
	System.out.println("Value Type");
	for(int i =1;i<=5;i++) {
		System.out.println("Do you want to proceed (Y/N)");
		String s = ss.next();
		
		if (s.equals("Y")||(s.equals("y"))) {
			System.out.println("Enter the Value to check :");
			int num= ss.nextInt();
			
			if(num%2==0) {
				System.out.println("Given input value is Even Number");
			}
			else{
				System.out.println("Given input value is Odd Number");
			}
		}
			else if  (s.equals("N") || s.equals("y")){
				System.out.println("Thank You");			
			}
	else {
				System.out.println("Invalid Input");
			}
	}			
	}
	}


