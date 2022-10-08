package com.keywords;

public class Static_Demo {

	public static int b = 15; // Static Variable

	public static void AAA() { // Static Method
		System.out.println("Static");
	}
	public static void BBB() {
		System.out.println("TAMIL");
		
}
	static { // Static Block
		System.out.println("Keyword");

	}

	public static void main(String[] args) {
		
		BBB();

		AAA(); // We can invoke Static Method wthout creating object.
		System.out.println(b);
	}

}
