package com.java;

import java.util.Arrays;

public class SuperMarket { // class creation
	private void salesPerson() {   // method1
		String name="Laxmi";
		byte idNumber=125;
		String[] loginTime= {"10:10"};
	
	System.out.println("Name:"+name+"-"+"SalesID:"+idNumber+"-"+"Time:"+Arrays.toString(loginTime));}	
public void purchase() { //method 2
float tomotto =25.87f;
double onion=38.59;
short prinjal=45;
byte discount=100/10;
System.out.println("Tomotto:"+tomotto);
System.out.println("Onion:"+onion);
System.out.println("Prinjal"+prinjal);
System.out.println("Discount"+discount+"%");}	
public void shop() { //method3
String wish="*********ALL IS WELL*******";
String sname="Reliance Fresh";
String address="15, Gandhi St, Rettery, Kolathur";
long pincode=600101l;
System.out.println(wish);
System.out.println(sname);
System.out.println(address+pincode);}
private void bill() { // method4
float totalValue =109.46f;
System.out.println("Total Amount:"+totalValue+"Rs");}	
protected void customer(){ //method5
int counterNumber=5;
System.out.println("CounterNumber:"+counterNumber);}
protected void customerNumber() {// method 6
int customerNumber=250;
System.out.println("Customer Number:"+customerNumber);}
protected void cell() { //method 7
	long cell=9952783828l;
	System.out.println("Customer mobile Number:"+cell);}
void thanks() { //method 8
	String thanks="THANKING YOU";
	System.out.println("*********"+thanks+"*************");}
public static void main(String[] args) {	
SuperMarket ss=new SuperMarket();
ss.shop();
ss.salesPerson();
ss.purchase();
ss.bill();
ss.customer();
ss.customerNumber();
ss.cell();
ss.thanks();}}



	
