package com.Practicing;

public class remove_white_spaces {
	
	public static void main(String[] args) {
		String s ="t    a    m  i l";
		String ss = s.replaceAll("[^A-Za-z]", "");
		System.out.println(ss);
	}

}
