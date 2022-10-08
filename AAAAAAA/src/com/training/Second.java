package com.training;

public class Second {
	
	private void AAA() {
System.out.println("NO Parameters");
	}

	private void AAA(String s) {
		System.out.println("Tom");
		
	}
	private void AAA(String name,int age) {
		System.out.println("Tamil");
		System.out.println(29);
		
		
	}
	public static void main(String[] args) {
		Second sec = new Second();
		sec.AAA();
		sec.AAA("s");
	sec.AAA(null, 0);
	}
}

