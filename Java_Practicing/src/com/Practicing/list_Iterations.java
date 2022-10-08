package com.Practicing;

import java.util.ArrayList;
import java.util.List;

public class list_Iterations {
	


public static void main(String[] args){

	List<Object> lis = new ArrayList<>();
lis.add("String");
lis.add(121);
lis.add('T');
lis.add(55);
lis.add(55);

for(int i=0;i<lis.size();i++){
System.out.println(lis.get(i));
}
for(Object obj : lis){
System.out.println(obj);
}
}
		


	}

