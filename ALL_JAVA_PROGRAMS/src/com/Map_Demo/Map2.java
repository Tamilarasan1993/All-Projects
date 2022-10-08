package com.Map_Demo;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Map2 {
	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<Integer,String>();
		m.put(0, "T");
		m.put(1, "TOM");
		m.put(3, "TOM");
		m.put(4, "STS");
		m.put(0, "TAMIL");
		m.put(3, "TOMMY");//Allows duplicate but override values
		m.put(5, "STS");//Allows Override Duplicate values
		//m.put(null, null);//Not allows NULL in KEY and VALUE.
		System.out.println(m);//Prints in Random Order And SYNCHRONIZED
		Map<Integer, String> mm = new ConcurrentHashMap<Integer,String>();
		mm.put(1, "TOM");
		mm.put(3,"STS");
		mm.put(2, "TAMIL");
		mm.put(5, "STS");
		mm.put(1, "MAP");
System.out.println(mm);//Prints Random It is ASYCHRONIZED. 
	}

}
