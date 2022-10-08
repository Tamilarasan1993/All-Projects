package com.keywords;

final class Final_Demo  { //Final Class Cannot be inherited.
	
	final int i =100; //Final Variable cannot be changed.
	
	final void Demo() { //Final method cannot be overriden.
		int b=200;
System.out.println(b);
	}
	public static void main(String[] args) {
		Final_Demo fd= new Final_Demo();
		fd.Demo();
		System.out.println(fd.i);
		
	}
	

	
	
}

