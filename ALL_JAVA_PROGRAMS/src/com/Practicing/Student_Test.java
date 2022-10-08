package com.Practicing;

public class Student_Test {
	int stu_id =1993;
	String stu_name ="Tom Sts";
	int maths =88;
	int science = 89;        //TASK QUESTION :3
	int tamil =90;
	
	public void getStuData() {
		System.out.println("Stu_id : " +stu_id);
		System.out.println("Stu_name : " +stu_name);
		System.out.println();
	}
	public void getStuMarks(){
      System.out.println("Maths mark is :" +maths);
      System.out.println("Science mark is :" +science);
      System.out.println("Tamil mark is :" +tamil);
      System.out.println();
	}                                 
	public void totalMarks() {
		System.out.println("Total marks : "+(maths+science+tamil));
}
	public static void main(String[] args) {
		Student_Test st =new Student_Test();
		
		st.getStuData();
		st.getStuMarks();
		st.totalMarks();
		
	}
}
