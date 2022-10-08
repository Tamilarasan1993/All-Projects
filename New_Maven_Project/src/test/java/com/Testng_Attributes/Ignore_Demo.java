package com.Testng_Attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
	
	@Test
	private void Chennai() {
		System.out.println("Chennai");
	}
	@Ignore  //Annotaion
	@Test
	private void Bangalore() {
		System.out.println("Bangalore");
	}
	@Test
		private void Kerala() {
		System.out.println("Kerala");
		}
	
	//Enabled Attribute
	@Test(enabled = false)
	private void Delhi() {
		System.out.println("Delhi");
	}

}
