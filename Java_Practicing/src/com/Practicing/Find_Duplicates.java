package com.Practicing;

public class Find_Duplicates {

	public static void main(String[] args) {
		String[] s= {"Tamil","Tamil","Tom","Tom","Marvel"};
		System.out.println(s.length);
		
		for(int i =0;i<s.length;i++) {
			
		for(int j=i+1;j<s.length;j++) {
		
			if(s[i].equals(s[j])) {
		
		System.out.println("Dupilicate value/element is "+s[i]);
	}
				
	}
	}
		
}
	
	
}
