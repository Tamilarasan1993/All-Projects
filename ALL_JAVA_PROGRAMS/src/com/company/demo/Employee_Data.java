package com.company.demo;

public class Employee_Data extends Company_Data {

public void Emp_Name() {
System.out.println("Employee Name : Tom");
}
public void Emp_Age() {
System.out.println("Employee Age : 29");
}
public static void main(String[] args) {
Employee_Data ed = new Employee_Data();

ed.CompAddress();
ed.CompName();
ed.CompBranch();
ed.Emp_Name();
ed.Emp_Age();


}
}

