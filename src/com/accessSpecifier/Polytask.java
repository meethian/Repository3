package com.accessSpecifier;
public class Polytask {
public void srmHospital() {
System.out.println("SRM MEDICAL COLLEGE HOSPITAL-Vadapalani");}

public void customer(String name,long admissionNumber) {
System.out.println("Doctor Name:Dr.Mugesh; Patient Nmame:"+name+";Patient Admission number:"+admissionNumber);}	

protected void feedetails(int doctorFee,String roomFee) {
System.out.println("DoctorFee:"+doctorFee+";"+"Room Fee:"+roomFee);}
                                                 
public static void main(String[] args) {
	                                      
	Polytask srm=new Polytask();
	srm.srmHospital();                             
	srm.customer("Mr.Mumar", 102486l);
	srm.feedetails(1000,"Depends");
	}
}


