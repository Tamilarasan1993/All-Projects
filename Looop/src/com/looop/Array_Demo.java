package com.looop;

public class Array_Demo {

public static void main(String[] args) {
	//datatype refname[] = new datatype[length];
	int b[] = new int[8];
	//refname[index]=value;
	b[0] = 100;
	b[1] = 200;
	b[2] = 300;
	b[3] = 400;
	b[4] = 500;
	b[5] = 600;
	System.out.println("By using for loop");
	for (int i = 0; i <=b.length-1; i++) {
		System.out.println(b[i]);
		
	}
	System.out.println("By using for each");
	for (int i : b) {
		System.out.println(i);
		
	}
}
	
}
