package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List_Demo {
	public static void main(String[] args) {
		
		List<Object> li =new ArrayList<Object>();
		li.add("Tom Sts");
		li.add(28);
		li.add(true);
		li.add("Tom");
		li.add("Cat");
		li.add(1993);
		li.add("Tom");
		li.add(9);
		li.add(2, "Tamil");
		li.add(null);
		System.out.println(li);
		int size = li.size();
		System.out.println("Size of list : "+size);
		int index = li.size()-1;
		System.out.println("Index of list :"+index);
		int indexOf = li.indexOf("Tom");
		System.out.println("First occurence of Tom:"+indexOf);
		int lastIndexOf = li.lastIndexOf("Tom");
		System.out.println("Last occurence of Tom:"+lastIndexOf);
		Object Object = li.get(5);
		System.out.println(Object);
		//Object object2 = li.get(12); //if we give unknown error will occur
		//System.out.println(object2);
		li.set(5, "Dog");
		System.out.println(li);
		boolean empty = li.isEmpty();
		System.out.println(empty);
		boolean contains = li.contains(1993);	
		System.out.println(contains);
		li.remove(6);
		System.out.println(li);
		li.remove("Tom");
		System.out.println(li);
		li.clear();
		System.out.println(li);
		boolean equals = li.equals(li);
		System.out.println(equals);
		int hashCode = li.hashCode();
		System.out.println(hashCode);
	}

}
