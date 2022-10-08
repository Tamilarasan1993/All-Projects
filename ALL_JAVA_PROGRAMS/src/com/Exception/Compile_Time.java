package com.Exception;

public class Compile_Time {
	public static void main(String[] args) throws InterruptedException  {
		String s="Tom";
		System.out.println(s);
		Thread.sleep(5000); 
		System.out.println(s+"Sts");
	}             //If we try Thread.sleep() without "throws" keyword 
	              //it will throw Interrupted Exception.

}
