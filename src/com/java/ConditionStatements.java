package com.java;

import java.util.Scanner;

public class ConditionStatements {
	Scanner sca = new Scanner(System.in);
		
	public  void method1()	{
	String name=sca.nextLine()	;
	System.out.println(name);
	}
	public  void method2()	{
	int num=sca.nextInt();
	System.out.println(num);
	}
	public  void method3()	{
		char init=sca.next().charAt(0);
		System.out.println(init);
		}
public static void main(String[]  args) {
ConditionStatements obje=new ConditionStatements();

	obje.method1();
	obje.method2();
	obje.method3();
}
		
	}
		



