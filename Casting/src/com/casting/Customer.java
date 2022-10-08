package com.casting;

public class Customer extends Amazon {
	@Override
	public void Product1() {
		System.out.println("Samsung TV");
	}

	@Override
	public void Product2() {
		System.out.println("TOY");

	}
	public void Mobile() {
System.out.println("OPPO");

	}
public static void main(String[] args) {
	Customer cus = new Customer();
	cus.Product1();
	cus.Product2();
	cus.Mobile();
	
}
}
