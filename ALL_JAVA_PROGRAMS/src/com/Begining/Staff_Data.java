package com.Begining;

public class Staff_Data extends Student_Data{
	public void Staff_Name() {
    System.out.println("Staff Name = Riddle");
    
	}

	public void Staff_Age() {
   System.out.println("Staff Age = 30");
   
	}
   public static void main(String[] args) {
	Staff_Data data = new Staff_Data();
	data.Staff_Name();
	data.Stu_Name();
	data.Staff_Age();
   } 
}

