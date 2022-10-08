package com.Converting;

public class Converting_Datatypes {
	public static void main(String[] args) {
		
		//Byte > String and String > Byte
		Byte bb= 111;
		System.out.println("Byte value is "+bb);
		String sb = String.valueOf(bb);
		System.out.println("After convert Byte to String "+sb);
		byte bs = Byte.parseByte(sb);
		System.out.println("After convert String to Byte "+bs);
		//Convert int > String and String > int
		int i = 1993;
		System.out.println("\nInt value is :"+i);
		String valueOf = String.valueOf(i);
		System.out.println("After convert int to String :"+( valueOf));
		int parseInt = Integer.parseInt(valueOf);
		System.out.println("After convert String to int :"+parseInt);
		//Double > String and String > Double
		double d =28.1993;
		System.out.println("\nDouble value is :"+d);
		String valueOf2 = String.valueOf(d);
		System.out.println("After convert Double to String :"+valueOf2);
		double parseDouble = Double.parseDouble(valueOf2);
		System.out.println("After convert String to Double :"+parseDouble);
		//Boolean > String and String > Boolean
		boolean b =true;
		System.out.println("\nBoolean value is :"+b);
		String valueOf3 = String.valueOf(b);
		System.out.println("After convert Boolean to String :"+valueOf3);
		boolean parseBoolean = Boolean.parseBoolean(valueOf3);
		System.out.println("After convert String to Boolean :"+parseBoolean);
		//Long to String and String to Long
		long l =1234567890009L;
		System.out.println("\nLong value is :"+l);
		String valueOf4 = String.valueOf(l);
		System.out.println("After convert Long to String :"+valueOf4);
		long parseLong = Long.parseLong(valueOf4);
		System.out.println("After conert String to Long :"+parseLong);
		
	}

}