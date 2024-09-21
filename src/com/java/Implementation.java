package com.java;
import java.util.Scanner;
public class Implementation {
Scanner user=new Scanner(System.in);
String name2;//scanner for class variable
static String name3;
public void javafullTest( ){
Scanner user=new Scanner(System.in);
System.out.println("enter name1");
String name1=user.next();//scanner for local variable
System.out.println("enter name2");
 name2=user.next();//scanner for instance variable
System.out.println("enter name3");
name3=user.next();//scanner for static variable
System.out.println(name3.length());	
System.out.println(name2.isEmpty());
System.out.println(name1.equals(name2));
System.out.println(name2.equalsIgnoreCase(name3));
System.out.println(name1.contains("raj"));
}		
public static void main(String[] args)	{	
	
		Implementation interfece =new Implementation ( ); 
		interfece.javafullTest ();}}