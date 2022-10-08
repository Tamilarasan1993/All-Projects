package com.cts.prime;

public class StudentData {  
	
	public void stu_Name() {
      // first method
		
		System.out.println("student name : tamil");
	}
	
	public void stu_age() {
    System.out.println("student age : 18");
   
	}
	public void stu_gender() {
    System.out.println("student gender : male");
	}
	public void stu_no() {
    System.out.println("student number : 88");
	}
	public static void main(String[] args) {
		
		
		StudentData sd = new StudentData();
		sd.stu_no();
		sd.stu_gender();
		sd.stu_Name();
		sd.stu_age();
		
}
	

}
