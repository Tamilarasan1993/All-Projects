package com.Constructor;

public class Demo4 {
	
	public Demo4() {
System.out.println("JAVA CLASS");
	}
	public Demo4(String name) {
		this();
		System.out.println(name);
			}
	public Demo4(int age) {
		this("Tom");
		System.out.println(age);
			}
	public Demo4(double sal) {
		this(29);
		System.out.println(sal);
			}
	public static void main(String[] args) {
		Demo4 dd = new Demo4(65000.21);
		
	}
			
			

}
