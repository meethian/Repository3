package com.java;
import java.util.Arrays;
public class ExceptionPractice {
public void exception()  throws InterruptedException  {
	int arr[]=new int [2];
	System.out.println(arr.length);
	
Thread.sleep(600);
	System.out.println("hh");
}	
	
	
public static void main(String[] args) throws InterruptedException{
	ExceptionPractice scan=new ExceptionPractice()	;
   scan.exception();
	
System.out.println("Exception Handled");
}}
