package com.Testng_Attributes;

import org.testng.annotations.Test;

public class GroupsOFGroups {

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
	@Test(groups ="MostLoved")
	private void Marvel() {
		System.out.println("Marvel");
	}
	@Test(groups ="MostLoved")
	private void Avengers() {
		System.out.println("Avengers");
	}
	@Test(groups ="MostLoved")
	private void SpiderMan() {
		System.out.println("SpiderMan");
	}
	
	
}
