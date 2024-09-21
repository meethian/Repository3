package com.java;
public class Day_1_IPT extends Class_1 {
	Day_1_IPT(){
	super.method_2();
		System.out.println("This is first Constructor");
	method_2();
	}
public void method_1() {
	System.out.println("method_1");
	//method_2();
}

public static void main(String[] args) {
Class_1	 aa = new Day_1_IPT();
//parent         //child
//	new Day_1_IPT().method_1();
//	new Day_1_IPT().method_2();
}}
class	Class_1{
	Class_1(){
		
   System.out.println("This is second Constructor");
   method_2();
   }
 void method_2() {
	 System.out.println("method_2");
	
	}
}

