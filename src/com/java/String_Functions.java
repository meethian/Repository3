package com.java;
import java.util.Scanner;
public class String_Functions {
	static String name1="how do u do"; // static variable
	String  name2=new String("how are you");
	String name3; //instance variable
	public static void method1() {
	String name4="hai  hallo";  //local variable
	System.out.println("Length:"+name4.length());
	int outputname=name1.length();
	System.out.println("Length:"+outputname);
	}
	private static void method2() {
	String	name3="vanakkkam";
	boolean equal=name1.equals(name3);
	System.out.println("Equals:"+equal);
	System.out.println("Equals:"+name1.equals(name3));
	}
	
public static void main (String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter name3");
	String name3=scan.nextLine();

String_Functions ok=new String_Functions ();
	method1();
	method2();
}
}