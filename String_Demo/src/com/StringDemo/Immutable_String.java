package com.StringDemo;

public class Immutable_String {
public static void main(String[] args) {
	String s ="TomSts";
	System.out.println(s);
	System.out.println((System.identityHashCode(s)));
	String s1="TomSts";
	System.out.println(s1);
	System.out.println((System.identityHashCode(s1)));
	String concat = s1.concat(s);
	System.out.println(concat);
	System.out.println((System.identityHashCode(concat)));
}
	
}
