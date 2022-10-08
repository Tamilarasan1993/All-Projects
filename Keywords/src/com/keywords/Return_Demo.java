package com.keywords;

public class Return_Demo {
	
	public int AAA() {
		int i=10;
		i=20;
		return i=30; //Using return keyword value will be constant .
		//i=40; We cannot override the value after giving RETURN keyword.
	}	
	public double BBB() {
       double d = 58880.5555;
       return d;
	}

	public static void main(String[] args) {
		Return_Demo rd = new Return_Demo();
		
		int aa = rd.AAA();
		System.out.println(aa+100);
		
		double bb = rd.BBB();
		System.out.println(bb);
		
	}
}
