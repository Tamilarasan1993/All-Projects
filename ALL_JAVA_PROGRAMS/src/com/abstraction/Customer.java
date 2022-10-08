package com.abstraction;

public class Customer extends Bank {
	
	public void Cus() {
System.out.println("Customer name : TAMIL");
	}

	@Override
	public void CurrentAcc() {
	System.out.println("CurrentAcc : 50000");	
	}
	
	@Override
	public void Banking() {
System.out.println("BANKING MODE : ONLINE");
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.Banking();
		c.CurrentAcc();
		c.GoldLoan();
		c.Cus();
	}
	
}
