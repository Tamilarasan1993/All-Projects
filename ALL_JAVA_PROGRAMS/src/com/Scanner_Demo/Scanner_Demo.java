package com.Scanner_Demo;

import java.util.Scanner;

public class Scanner_Demo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age....");
		byte age = scan.nextByte();
		System.out.println("Your Age is : "+age);
		System.out.println("Enter your birth year....");
		short year = scan.nextShort();
		System.out.println("Your birth year is :"+year);
		System.out.println("Enter your ID_no ....");
		int id_no = scan.nextInt();
		System.out.println("Your ID_no is :"+id_no);
		System.out.println("Enter your acc no....");
		long acc_no = scan.nextLong();
		System.out.println("Your acc_no is :"+acc_no);
		System.out.println("Enter your Percentage....");
		float per = scan.nextFloat();
		System.out.println("Your Percentage is :"+per);
		System.out.println("Enter your Expectation salary....");
		double salary = scan.nextDouble();
		System.out.println("Your salary is :"+salary);
		System.out.println("Are you a robot");
		boolean torf = scan.nextBoolean();
		System.out.println("true or false :"+torf);
		
			}

}
