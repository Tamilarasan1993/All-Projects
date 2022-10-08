package com.casting;

public class Amazon {

	public void Product1() {
		System.out.println("Sony TV");
	}

	public void Product2() {
		System.out.println("Bicycle");
	}

	public static void main(String[] args) {
Customer c = (Customer) new Amazon(); // DOWNCASTING
									 // ClassCastException Occurred
									 //  RunTime Error  

c.Product1();
c.Product2();
c.Mobile();

	}

}

                     