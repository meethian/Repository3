package com.java;

public class Polymortask {
	public void srmHospital() {
	System.out.println("SRM MEDICAL COLLEGE HOSPITAL-Vadapalani");}

	public void customer(String name,long admissionNumber) {
	System.out.println("Doctor Name:Dr.Mugesh; Patient Nmame:"+name+";Patient Admission number:"+admissionNumber);}	

	public void feedetails(int doctorFee,String roomFee) {
	System.out.println("DoctorFee:"+doctorFee+";"+"Room Fee:"+roomFee);}

	public static void main(String[] args) {
	Polymorphism srm1=new Polymorphism();
	srm1.srmHospital();
	srm1.customer("Mr.Kumar", 102486l);
	srm1.feedetails(1000,"Depends on your usage");
	}
	}

