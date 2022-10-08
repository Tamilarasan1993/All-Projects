package com.polymorphism.demo;

public class Student_Details {
	private void Student_Information() {
		System.out.println("**Student Information**");
	}
	private void Student_Information(String Firstname, String Lastname) {
		System.out.println(" Student Firstname : " + Firstname);
		System.out.println(" Student Lastname : " + Lastname);
	}
	private void Student_Information(int age) {
		System.out.println(" Student Age : " + age);
	}
	private void Student_Information(String Gender) {

		System.out.println(" Stundent Gender : " + Gender);
	}
	private void Student_Information(String Address, int pincode) {
		System.out.println(" Student Address : " + Address);
		System.out.println(" Address Pincode : " + pincode);
	}
private void Student_Information(String Fathername, char a, String Mothername, char b) {
		System.out.println(" Student's FatherName : " + Fathername);
		System.out.println(" Father's Initial : " + a);
		System.out.println(" Student's MotherName : " + Mothername);
		System.out.println(" Mother's Initial : " + b);
	}
	private void Student_Information(long BankAccount) {
		System.out.println("Student's BankAcc NO : " + BankAccount);
		}
    public static void main(String[] args) {
		Student_Details sd = new Student_Details();
		sd.Student_Information();
		sd.Student_Information(" Captain "," America ");
        sd.Student_Information(29);
		sd.Student_Information(" Male ");
		sd.Student_Information("Chennai ", 600019);
		sd.Student_Information(" Thanos ",'S' , " Natasha ",'T');
		sd.Student_Information(1000001234567L);
		}
        }
