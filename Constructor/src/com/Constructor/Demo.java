package com.Constructor;
public class Demo {

	
	public Demo() {       //Default Constructor
System.out.println("Default Constructor");
	}
	private void demo() {    //Normal Constructor
System.out.println("Hi Hello");
	}
public static void main(String[] args) {
	Demo d = new Demo();
	d.demo();
}
}
