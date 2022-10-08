package com.VariableDemo;

public class FinalVariable {
	final int ab = 900;

	private void ABC() {
		
		System.out.println(ab);
	}

	private void DEF() {
		int b = 11;
		b = 22;
		System.out.println(b + b);
	}

	public static void main(String[] args) {
		FinalVariable fvar = new FinalVariable();

		System.out.println(fvar.ab);
		fvar.ABC();
		fvar.DEF();
		int ff = fvar.ab;
		System.out.println(ff + 66);
	}
}
