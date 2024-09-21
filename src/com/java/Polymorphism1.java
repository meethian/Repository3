package com.java;

public class Polymorphism1 extends Polymorphism{//childclass
public void srmHospital() {
System.out.println("SRM MEDICAL COLLEGE HOSPITAL-Kattankolathur");
super.srmHospital();}
public void customer(String name, long admissionNumber) {
System.out.println("Doctor Name:Dr.Gugesh; Patient Nmame:"
+name+";Patient Admission number:"+admissionNumber);
super.customer(name, admissionNumber);}	

public void feedetails(int doctorFee, String roomFee) {
System.out.println("DoctorFee:"+doctorFee+";"+"Room Fee:"
+roomFee);
  super.feedetails(doctorFee, roomFee);
        }
public static void main(String[] args) {
		Polymorphism1 srm2=new Polymorphism1();
		srm2.srmHospital();
		srm2.customer("Mr.Ravi", 20084l);
		srm2.feedetails(2000,"Depends on your usage");}}
	


