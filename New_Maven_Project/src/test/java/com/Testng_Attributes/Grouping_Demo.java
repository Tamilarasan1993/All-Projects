package com.Testng_Attributes;

import org.testng.annotations.Test;

public class Grouping_Demo {
	
	@Test(groups = "MostLiked")
	private void Australia() {
		System.out.println("Australia");
		}
	@Test(groups = "MostLiked")
	private void London() {
		System.out.println("London");
	}
	@Test(groups = "MostHated")
	private void America() {
		System.out.println("America");
	}
	@Test(groups ="MostLiked")
	private void Spain() {
		System.out.println("Spain");
	}
	@Test(groups ="MostHated")
	private void China() {
		System.out.println("China");
	}
	
	
	
}
