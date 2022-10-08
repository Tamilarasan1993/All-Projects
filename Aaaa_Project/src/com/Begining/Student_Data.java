package com.Begining;

public class Student_Data {
	public void Stu_Name() {
   System.out.println("Student Name = TOM");
	}
	
	public void Stu_Age() {
    System.out.println("Stutent Age  = 29");
	}
	
	void Stu_Add() {
    System.out.println("Student Address = Chennai");
	}
	
	public static void main(String[] args) {
		Student_Data sd = new Student_Data();
		sd.Stu_Name();
		sd.Stu_Age();
		sd.Stu_Add();
    
	}

}
