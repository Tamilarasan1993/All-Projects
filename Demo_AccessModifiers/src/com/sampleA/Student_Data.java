package com.sampleA;

public class Student_Data {
	private void Stu_Name() {
		System.out.println("Student Name : TOM");
	}

	public void Stu_Age() {
		System.out.println("Student Age : 29");
	}

	protected void Stu_Add() {
		System.out.println("Student Address : Chennai");
	}

	void Stu_Edu() {
		System.out.println("Student Education : BSC");
	}

	public static void main(String[] args) {
		Student_Data data = new Student_Data(); // ACCESS MODIFIERS WITHIN CLASS
		data.Stu_Name();
		data.Stu_Age();
		data.Stu_Add();
		data.Stu_Edu();

	}
}
