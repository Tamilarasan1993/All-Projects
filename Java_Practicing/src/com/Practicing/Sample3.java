package com.Practicing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sample3 {
public static void main(String[] args) {
	

String s ="My Name Is Tamil My Is Tamil Name";
System.out.println(s);
String[] split = s.split(" ");

Set<String> set = new LinkedHashSet<String>();
for(String s1:split) {
	set.add(s1);
}
Iterator it = set.iterator();

while (it.hasNext()) {
	System.out.print(it.next()+" ");
	
}


}
}	
