package com.Begining;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BBB {
	public static void main(String[] args) {
		
	
	
	Map< String, Integer> m = new LinkedHashMap<>();
	m.put("Tom", null);
	m.put("Tamil", 29);
	m.put("Spidy", null);
	m.put("Tom", 60000);
	m.put("spidy", 100);
	m.put(null, 10);
	m.put(null, 333);	
	
	int size = m.size();
	System.out.println(size);
	Set<String> k = m.keySet();
System.out.println(k);
Collection<Integer> v = m.values();
	System.out.println(v);
	Integer aaa= m.get("Tom");
	System.out.println(aaa);
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	System.out.println(entrySet);
	
	
	
}
}