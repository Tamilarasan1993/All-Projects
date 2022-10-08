package com.Map_Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Map_Demo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("", "TomSts");
		map.put(null, "Tamil");//Allows NULL values in KEY
		map.put("No", "Map");
		map.put("", "Okay");
		map.put("S", null);
		map.put("T", null);// Allows NULL values in VALUE
		map.put(null, "TOM");
		int size = map.size();
		System.out.println(size);
		System.out.println(map);//Prints in Random Order
		Map<Integer, String> map1 = new LinkedHashMap<Integer,String>();
		map1.put(3,"TOM" );
		map1.put(null, "MAP");//Allows NULL values in KEY
		map1.put(2, null);
		map1.put(1, "TOM");
		map1.put(3,null);// Allows NULL values in VALUE
		map1.put(null, "OK");
		int size2 = map1.size();
		System.out.println(size2);
		System.out.println(map1);//Prints in Insertion Order
		Map<Character, String> map2 = new TreeMap<Character,String>();
		map2.put('M', null);
		map2.put('T', "TOM");
		//map2.put(null, "STS"); TreeSet Not allows NULL in KEY.It throws ERROR.
		map2.put('L', "TOM");
		map2.put('S', null); //VALUE Allows more than one null values.
		System.out.println(map2);//Prints in Ascending Order
	}

}
