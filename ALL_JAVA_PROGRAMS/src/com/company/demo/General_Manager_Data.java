package com.company.demo;

public class General_Manager_Data extends Employee_Data {
	private void GM_Name() {
System.out.println("General_Manager Name : Randy ");
}
public static void main(String[] args) {
	General_Manager_Data gmd = new General_Manager_Data();
	gmd.GM_Name();
	gmd.CompName();
	gmd.CompAddress();
	gmd.Emp_Name();
	gmd.Emp_Age();
}
}
