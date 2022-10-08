package com.Collection;

import java.util.LinkedList;
import java.util.List;

public class List4 {
	public static void main(String[] args) {
		List<Integer> list =new LinkedList<Integer>();
	    list.add(55);
	    list.add(545);
	    list.add(90);
	    list.add(null);
	    list.add(90);
	    list.get(2);
	    System.out.println(list);
	    list.set(2, 80);
	    System.out.println(list+"\n");
	    System.out.println("After Iteration :\n");
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	    	System.out.println("After ForEach ::\n");
	    for (Integer integer : list) {
			System.out.println(integer);
	    
	    }
	
	}

}
