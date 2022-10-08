package com.Constructor;
//Chain Constructor
public class Demo3 extends Demo2 {	
	
	public Demo3() {
		super("Tom");//super();-->Parent class Constructor
System.out.println("Chain");
}
	public Demo3(String name) {
		this();   //this();-->Current class Constructor   
		System.out.println(name);
		}
	public Demo3(int age ) {
		this("TAMILARASAN");
		System.out.println(29);
		}
	public Demo3(float salary) {
		this(29);
		System.out.println(salary);
		}
	public static void main(String[] args) {
		Demo3 d3=new Demo3(55550.55f);
		
	}

}
   