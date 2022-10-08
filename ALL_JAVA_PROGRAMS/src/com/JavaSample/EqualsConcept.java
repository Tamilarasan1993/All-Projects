package com.JavaSample;

public class EqualsConcept {
	public static void main(String[] args) {
		
	String s ="JAVA";    //Literal type
	System.out.println(s);
	String s1=new String("JAVA"); // New keyword type
	System.out.println(s1);
	if(s.equals(s1)) {
		System.out.println("Both are Equal");
	}
	else {
		System.out.println("Both are Not Equal");
	}
}
}

			// (==)=It checks the memory reference.
			//(.equals)=It checks the Strings