package com.java;

public class ArrayAugust {
public static void main(String[]args) {
// 1D-non literal string array
	String javaClass[]=new String [5];
	
	javaClass [0]="Meethian";
	javaClass [1]="Yuvaraj";
	javaClass [2]="Danush";
	javaClass [3]="Arunkumar";
	javaClass [4]="Akila";    
	System.out.println(javaClass.length); // length check
	System.out.println(javaClass.length-1); // index check            //method1-Array typing
System.out.println(" "+javaClass[0]+","+javaClass[1]+","+javaClass[2]+","+javaClass[3]+","+javaClass[4]);
	for(int i=0;i<=javaClass.length-1;i++) {                       //method 2 Array typing
		System.out.print(" "+javaClass[i]);}
		System.out.println("----This is for loop");
	for(String foreach:javaClass) {                                 //method3 array typing
	System.out.print(" "+foreach);}
	System.out.println("-----This is forEach loop");}}
