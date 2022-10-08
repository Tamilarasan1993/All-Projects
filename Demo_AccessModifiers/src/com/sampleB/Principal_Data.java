package com.sampleB;

import com.sampleA.Student_Data;

public class Principal_Data extends Student_Data {

	public static void main(String[] args) {
		Principal_Data pd = new Principal_Data();
		pd.Stu_Add();
		pd.Stu_Age();
		

		// Here Public and Protected Accessible
		// For Protected we should create child class object.
	}
}
