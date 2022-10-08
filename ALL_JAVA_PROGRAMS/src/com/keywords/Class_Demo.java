package com.keywords;

public class Class_Demo {

	int a;
	
	private void ABC() {
    int i = 10;
    i=20;
    System.out.println(i);
	}
	private void BBB() {
		System.out.println(a);
	}
	private void CCC() {
		a = 200;
System.out.println(a);
	}
	

	public static void main(String[] args) {
		Class_Demo cd = new Class_Demo();
		int value = cd.a;
		System.out.println(value);
		cd.ABC();
		
		cd.BBB();
		cd.CCC();
		
		
	}
}

