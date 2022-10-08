package com.StringDemo;

public class Mutable_Strings {
	public static void main(String[] args) {
		StringBuffer s =new StringBuffer("Tamil");
		System.out.println(s);
		System.out.println((System.identityHashCode(s)));
		StringBuffer s1 =new StringBuffer("Tamil");
		System.out.println(s1);
		System.out.println((System.identityHashCode(s1)));
		System.out.println("AfterAppend");
		StringBuffer append =s.append(s1);
		System.out.println(append);
		System.out.println((System.identityHashCode(append)));
		
	}

}
