package com.Scanner_Demo;

import java.util.Scanner;

public class Scanner_2 {
public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.println("Enter your Full Name...");
	String Fullname = ss.nextLine();
	System.out.println("FullName is :"+Fullname);
	System.out.println("Enter your First name ...");
	String firstname = ss.next();
	System.out.println("FirstName is :"+firstname);
}
}
