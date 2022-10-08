package com.VariableDemo;

public class StaticVariable {
	
	static int ab = 100;
	static String s ="TOM";
	
	
	private void AAA() {
     String s = "TOM"; 
     s = "TOMSTS";
     System.out.println(s);
	}
	
	private void BBB() {
     int i = 200;
     System.out.println(i);
	}
	
	private void CCC() {
     System.out.println(ab);
	}
	
	public static void main(String[] args) {
		StaticVariable st = new StaticVariable();
	String s2 = st.s;
	System.out.println(s2);
	System.out.println(ab);
		st.AAA();
		st.BBB();
		st.CCC();
		int Svar = st.ab;
		System.out.println(Svar+33);
	}
	
	
	
	
	
	

}
