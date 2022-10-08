package com.Map_Demo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<Integer,String>();
		m.put(11, "TOM");
		m.put(22, "STS");
		m.put(33, "TAMIL");
		m.put(44, "ARASAN");
		m.put(22, "TAMIL");
		System.out.println(m);
		int size = m.size();
		System.out.println("Size of Map :"+size);
		int index =m.size()-1;
		System.out.println("Index of Map :"+index);
		boolean containsKey = m.containsKey(44);
		System.out.println("44 is in Map or not :"+containsKey);
		boolean containsValue = m.containsValue("Tom");
		System.out.println("Tom is in Map or not :"+containsValue);
		String string = m.get("TOM");//if we give unknown KEY it returns NULL
		System.out.println("If we give Unkown key.It will print :"+string);
		String string2 = m.get(22);
		System.out.println("Given KEY(22)'s value is :"+string2);
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		Collection<String> values = m.values();
		System.out.println(values);
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		boolean empty = m.isEmpty();
		System.out.println("Map is empty or not :"+empty);
		m.clear();
		System.out.println("It prints EmptyMap :"+m);
		
	}

}
