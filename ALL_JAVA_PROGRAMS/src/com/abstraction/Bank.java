package com.abstraction;

public abstract class Bank {
	//Abstract
	public abstract void Banking();
	
	abstract void CurrentAcc();
	
	//Non-Abstract
	public void SavingsAcc() {
   System.out.println("Savings Account : 12345");
   
	}

	//Non-Abstract
	public void GoldLoan() {
System.out.println("Gold Loan : Nill");

	}

	public static void main(String[] args) {
	
	// Bank b = new Bank();	> Cannot create obj in Abstract class //

	
	}
	
}
