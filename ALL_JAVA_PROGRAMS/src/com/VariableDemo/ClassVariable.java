package com.VariableDemo;

public class ClassVariable {

	  int a; // CLASS VARIABLE

	private  void Class1() {
		int a = 100;
		a = 600;
		System.out.println(a);
	}
	private void Class2() {
		a = 500;
		System.out.println(a);
	}
	private void Class3() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		ClassVariable Class = new ClassVariable();
		System.out.println(Class.a); 
		int AAA = Class.a; // RETURN TYPE
		System.out.println(AAA+111);
		Class.Class1();
		Class.Class2();
		Class.Class3();
		
	}
}
