package com.Exception;

public class Exception2 {
	
	public static void main(String[] args) {
		
		String s ="@1993";
		System.out.println(s);
		
		try {
			System.out.println(Integer.parseInt(s));
		}
		catch (ArithmeticException e) { //incorrect
			//e.printStackTrace();
			System.out.println("ArithmeticException handle");
		}
		catch (NullPointerException e) { //incorrect
			System.out.println("NullPointerException handle");
		}
		catch (Exception e) {  //Correct catch
			//System.out.println(Integer.parseInt(s));//If exception Occurs inside Catch.It will not Handle.

			e.printStackTrace();
			System.out.println("NumberFormat Exception Handled");
		}
		
		
		
	}
	

}
