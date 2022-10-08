package com.StringDemo;

public class Split_String {
	
	public static void main(String[] args) {

		String s ="TomSts Is Tamil";
		String[] split = s.split(" ");
		for(int i =0;i<=split.length-1;i++) {
			System.out.println(split[i]);
		}
		for(String string:split) {
			System.out.println(string);
		}
		
	}
}