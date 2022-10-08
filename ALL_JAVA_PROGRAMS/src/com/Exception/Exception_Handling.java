package com.Exception;

public class Exception_Handling {
	public static void main(String[] args) {
		
	int a =100;
	//System.out.println(a/0); try Block will not handle error outside.
	try {
		System.out.println(a);
		System.out.println(a/0);
		// It doesnt know this Logics.it will not show error while compiling.
	} 
	catch (NullPointerException e) {    //We can give multiple CatchBlock.
		//e.printStackTrace();          //If the Catch is wrong ,it will go next Catch.
		System.out.println("Processing");//it will check for the Correct catchBlock.		
	} 
	catch (ArithmeticException e) {  //If catch correct,it will handle&jump to next process not next catch.
		//e.printStackTrace();
		System.out.println("Exception Handled");
	}
	catch (Exception e) {
		System.out.println("Final");
	}
	finally {       //It will print its execution,even error occured or not.
		System.out.println("Error Solved");
		System.exit(0); //it will terminate the process.
	}
	System.out.println("88");
	
	}

}
