package com.Exception;

public class Number_Format {
	public static void main(String[] args) {
		String s="@1993"; //Space is a Splcharacter.
		System.out.println(s);
		int parseInt = Integer.parseInt(s);//SplCharacter are not allowed.
		System.out.println(parseInt);// While converting to integer.
		
	}                                //If we give any spl charcter it will throw
	                                 //NumberFormat Exception.

	
}
