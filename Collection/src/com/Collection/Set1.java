package com.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;             //Set does not allow dupicate value
import java.util.TreeSet;         
public class Set1 {
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
		s.add("Tom");
		s.add("Cat");    //LinkedHashSet Prints in Insertion Order.
		s.add("Pig");
		s.add(null);
		System.out.println(s);
		Set<Object> s1 = new HashSet<Object>();
		s1.add(99);
		s1.add(99);      
		s1.add(null);    //HashSet prints in Random Order
		s1.add("Tom");
		s1.add(22);
		System.out.println(s1);
		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(33);    //TreeSet Prints Ascending order.
		s2.add(11);    //TreeSet Does not allow NUll value.
		s2.add(22);    //TreeSet Doesnot allow Object inside Generics
		System.out.println(s2);
		// If we give Object It will throw ClassCastException.  
		

	}

}
