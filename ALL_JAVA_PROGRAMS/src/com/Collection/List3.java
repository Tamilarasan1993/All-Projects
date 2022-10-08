package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class List3 {
	public static void main(String[] args) {
		List<Integer> li =new ArrayList<Integer>();
	li.add(100);
	li.add(200);
	li.add(300);
	li.add(400);
	li.add(500);
	
	Object[] array = li.toArray();
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	int length = array.length;
	System.out.println(length);
	String string = li.toString();
	System.out.println(string);
	int length2 = string.length();
	System.out.println(length2);
	
	}

}
