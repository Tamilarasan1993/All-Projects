package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Array_list {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("TOMSTS");
		li.add("TAMIL");
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		
		String string = li.toString();
		System.out.println(string);
	}

}
