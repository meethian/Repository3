package com.java;
import java.util.Scanner;
public class HomeTest {
	public static void main(String[] args) {
	Scanner condition =new Scanner ( System.in);
	       System.out.println (" enter a,b value");
	 int a=condition.nextInt();
	 int b=condition.nextInt();
if ( a>b && a!=b){
	      System.out.println ( "b is bigger");}

else if ( a==b || a>b){
	      System.out.println (" a is smaller");}
	
else if ( (a<b) !=  (a<b)){
	      System.out.println ("a is bigger");}
else { System.out.println ( " pgm over");}
	 Scanner loop=new Scanner (System.in);
		System.out.println("enter i value");
	int i= loop.nextInt();
		System.out.println("enter j value");
	int j= loop.nextInt();
	for ( i=i; i>= 1; i--){
	for ( j=i; j>=1; j--){
		System.out.print(j); 
		}
		System.out.println( );}
		
	 
	 
	 
	 
	 
	}}
