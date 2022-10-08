package com.Converting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList {

	public static void main(String[]args){

		int[] a = {10,20,30,40,50,60};
		
		for(int i =0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		List<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			li.add(a[i]);
		}
		
		System.out.println(li);
		
		Object[] ob=li.toArray();
		for (int i =0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
		
		
		String ss = li.toString();
		System.out.println(ss);
	
		List<String> li2 = new ArrayList<String>();
		for(int i =0;i<ss.length();i++) 
			li2.add(ss);
	System.out.println(li2);

	
	
	
	
	}
}