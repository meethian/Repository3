package com.java;
public class Polymorphism2 extends Polymorphism{//grandchild
public void srmHospital() {
System.out.println("SRM HOSPITAL-RAMAPURAM");
super.srmHospital();}
public void customer(String name, long admissionNumber) {
System.out.println("Doctor Name:Dr.Sugesh; Patient Nmame:"
+name+""
		+ ";Patient Admission number:"+admissionNumber);
super.customer(name, admissionNumber);}	
public void feedetails(int doctorFee, String roomFee) {
System.out.println("DoctorFee:"+doctorFee+";"+"Room Fee:"
+roomFee);
super.feedetails(doctorFee, roomFee);
}
public void close () {
System.out.println("Thanking You");}
public static void main(String[] args) {
Polymorphism2 srm3=new Polymorphism2();
srm3.srmHospital();
srm3.customer("Mr.Sumar", 302486l);
srm3.feedetails(1500,"Depends on your usage");
srm3.close();}		}
				
	
		
	


