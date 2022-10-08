package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
	List<Integer> li1 =new ArrayList<Integer>();
	li1.add(11);
	li1.add(22);
	li1.add(33);
	li1.add(44);
	li1.add(55);
	
	List<Integer> li2 =new ArrayList<Integer>();
	li2.add(11);
	li2.add(21);
	li2.add(31);
	li2.add(44);
	li2.add(51);
	
	//li1.addAll(li2); 
	//System.out.println("After addAll :"+li1);  //It will merge Two lists togther.
	//System.out.println(li2);
	//li1.removeAll(li2);
	//System.out.println("After RemoveAll :"+li1); //It will remove dublicate values.
	li1.retainAll(li2);
	System.out.println("After Retain :"+li1); //It will fetch the dublicate values.
	


	}
}
