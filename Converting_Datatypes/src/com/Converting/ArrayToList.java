package com.Converting;

import java.util.LinkedList;
import java.util.List;

public class ArrayToList {

	public static void main(String[]args){

		int a[]={10,20,30,40,50,60};
		for(int i =0;i<=a.length-1;i++){
		System.out.println(a[i]);
		}

		int length = a.length;
		System.out.println(length);

		List<Integer> li =new LinkedList<Integer>();
		for(int i = 0;i<=a.length-1;i++){
		li.add(a[i]);
		}
		System.out.println(li);
Object[] array =li.toArray();
for(int i=0;i<=array.length-1;i++) {
	System.out.println(array[i]);
}
	}

}
