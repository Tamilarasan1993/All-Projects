package com.Practicing;

public class ClassB extends ClassA{
	
	@Override
	public void M1() {
		super.M1();
	}
@Override
public void M2() {
	super.M2();
}
@Override
public void M3() {
	super.M3();
}
@Override
public void M4() {
	super.M4();
}
public static void main(String[] args) {
	ClassB cc = new ClassB();
	cc.M1();
	cc.M2();
	cc.M3();
	cc.M4();
}
}
