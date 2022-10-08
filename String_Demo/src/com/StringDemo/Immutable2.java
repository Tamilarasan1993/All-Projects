package com.StringDemo;

public class Immutable2 {

	public static void main(String[] args) {
		//STRING IMMUTABLE
		String s = "Tamil Arasan";
		System.out.println("STRING IMMUTABLE");
		String s1=s.concat(" Tom");
		System.out.println(s1);
		System.out.println(s);
		System.out.println(String.join("-", "09","12","1993"));
		System.out.println(s.concat(" STS"));
		System.out.println(s+"\n");
		
        //STRNG BUFFER IS IMMUTABLE		
		System.out.println("STRINGBUFFER IMMUTABLE ");
		StringBuffer sb=new StringBuffer("TOM STS");
		System.out.println(sb.append(" TAMIL"));
		System.out.println(sb);
		System.out.println(sb.delete(2, 6));
		System.out.println(sb);
		System.out.println(sb.insert(2, "M"));
		System.out.println(sb.replace(3, 5, "STS"));
		System.out.println(sb);
		System.out.println(sb.delete(3, 6));
		System.out.println(sb.reverse());

	}
	
	
}
