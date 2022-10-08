package com.overriding;

public class Customer extends Flipkart {

	@Override
	public void Mobiles() {

		System.out.println("Mobile Name : SAMSUNG");

		super.Mobiles();
	}

	@Override
	public void Laptops() {
		System.out.println("Laptop Name : ASUS");
		super.Laptops();
	}

	@Override
	public void Gadgets() {
		super.Gadgets();
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.Mobiles();
		c.Laptops();
		c.Gadgets();
	}
}