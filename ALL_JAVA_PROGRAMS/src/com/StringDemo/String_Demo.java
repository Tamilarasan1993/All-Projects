package com.StringDemo;

public class String_Demo {
	public static void main(String[] args) {
	
	String s ="Tamil As TomSts";

	int length = s.length();
	System.out.println("String Length is :"+length);
	int index =length-1;
	System.out.println("String Index is :"+index);
	System.out.println(s);
	boolean equals = s.equals("TAmil As TOMsts");
	System.out.println(equals);
	boolean equalsIgnoreCase = s.equalsIgnoreCase("TAMIL aS ToMSts");
	System.out.println(equalsIgnoreCase);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	char charAt = s.charAt(6);
	System.out.println(charAt);
	int indexOf = s.indexOf("T");
	System.out.println(indexOf);
	int lastIndexOf = s.lastIndexOf("T");
	System.out.println(lastIndexOf);
	boolean contains = s.contains("z");
	System.out.println(contains);
	boolean startsWith = s.startsWith("Tam");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("Sts");
	System.out.println(endsWith);
	String s1 ="  tamil  as  TOm  ";
	System.out.println(s1);
	String trim = s1.trim();
	System.out.println(trim);
	String replace = s.replace("Tamil", "TamilSts");
	System.out.println(replace);
	String concat = s.concat(" From India");
	System.out.println(concat);
	String substring = s.substring(2);
	System.out.println(substring);
	String substring2 = s.substring(2, 12);
	System.out.println(substring2);
	String join = s.join("-","Tamil","As","TomSts");
	System.out.println(join);
	}
}
