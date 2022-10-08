package com.Interface;

public class Son implements Father,Mother {  //can Achieve MultipleInheritance

	@Override
	public void FatherProperty1() {
		System.out.println("HOUSE");	
	}

	@Override
	public void FatherProperty2() {
	  System.out.println("CAR");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.FatherProperty1();
		s.FatherProperty2();
		s.MotherProperty1();
		s.MotherProperty2();
	}

	@Override
	public void MotherProperty1() {
		System.out.println("GOLD CHAIN");
	}

	@Override
	public void MotherProperty2() {
		System.out.println("GOLD WATCH");	
	}
}
