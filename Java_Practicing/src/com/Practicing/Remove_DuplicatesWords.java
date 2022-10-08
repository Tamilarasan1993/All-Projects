package com.Practicing;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_DuplicatesWords {

public static void main(String[] args) {
	String s= "My Name Is Tamil My Is Tamil Name";
	System.out.println(s);
	System.out.println("Before split "+s.length());
	
	String[] s1 = s.split(" ");
	for(int i=0;i<s1.length;i++) {
		System.out.print(s1[i]);
	}
	int length = s1.length;
	System.out.println("\nAfter split "+length);
	
	Set<String> set= new LinkedHashSet<String>();
	for(String str : s1){
	set.add(str);
	}

	Iterator itr = set.iterator();
	while(itr.hasNext()){
	System.out.print(itr.next()+" ");
	}
	
	












	
	
	
	
	
	
	
}


}
