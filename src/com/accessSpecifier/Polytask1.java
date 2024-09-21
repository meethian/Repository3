package com.accessSpecifier;

public class Polytask1 extends Polytask {
public void srmHospital() {
	System.out.println("SRM MEDICAL COLLEGE HOSPITAL-Katankolathur");
	super.srmHospital();}

public void customer(String name,long admissionNumber) {
	System.out.println("Doctor Name:Dr.Kugesh; Patient Nmame:"+name
	+";Patient Admission number:"+admissionNumber);
	super.customer(name,admissionNumber);}	

protected void feedetails(int doctorFee,String roomFee) {
	System.out.println("DoctorFee:"+doctorFee+";"+"Room Fee:"+roomFee);
	super.feedetails(doctorFee,roomFee);}

public static void main(String[] args) {
	Polytask1 srm1=new Polytask1();
	srm1.srmHospital();
	srm1.customer("Mr.kumar", 202486l);
	srm1.feedetails(2000,"depends on");}}