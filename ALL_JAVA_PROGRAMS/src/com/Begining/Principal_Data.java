package com.Begining;

public class Principal_Data extends Staff_Data{
	private void Princi_Name() {
System.out.println("Principal Name = Randy");
	}

	public static void main(String[] args) {
		Principal_Data pd = new Principal_Data();
		pd.Princi_Name();
		pd.Stu_Name();
		pd.Staff_Age();
	}
}
