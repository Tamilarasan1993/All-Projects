package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Methods {

	public static void main(String[] args) {
		
		Set<String> s  = new LinkedHashSet<String>();
		s.add("Tom");
		s.add("Tom");
		s.add(null);
		s.add(null);
		s.add("Tamil");
		s.add("Sts");
		System.out.println(s);
boolean contains = s.contains(null);
System.out.println(contains);
Object[] array = s.toArray();
for (Object object : array) {
	System.out.println(object);	
}
String string = s.toString();
System.out.println(string);
	}
}
