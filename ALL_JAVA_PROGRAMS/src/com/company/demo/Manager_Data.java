package com.company.demo;

public class Manager_Data extends Employee_Data  {
	private void ManagerName() {
System.out.println("Manager_Name : Riddle");
	}
	
	public static void main(String[] args) {
			
	Manager_Data md = new Manager_Data();
	md.ManagerName();
	md.CompName();
	md.CompAddress();
	md.Emp_Name();
	md.Emp_Age();
	}
	}
