package com.java;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Task {
	public static void main (String[] args) {
	String[] names= new String[7];
	names[0]="Meethi";
	names[1]="Meeran";
	names[2]="Balaji";
	names[3]="Keerthi";
	names[4]="Malar";
	names[5]="Suganya";
	names[6]="Harish";  //method1
	//System.out.println(names.length); //count check
	System.out.println(names[0]+","+names[1]+","+names[2]+","+names[3]+","+names[4]+","+names[5]+","+names[6]);
	 
	for(int i=6;i<=names.length;i--) { //method2
	//System.out.println(names[i]);
	}
for(String z:names) {//method 3
	//	System.out.println(z);
	}
	//System.out.println(Arrays.toString(names));	//method4
//second try	
	int[] age=new int[7];
	age[0]=34;
	age[1]=35;
	age[2]=26;
	age[3]=24;
	age[4]=31;
	age[5]=31;
	age[6]=22;//method1
System.out.println(age[0]+","+age[1]+","+age[2]+","+age[3]+","+age[4]+","+age[5]+","+age[6]);
	
for(int j=0;j<age.length;j++) {
System.out.println(age[j]);}//method2
System.out.println("........................");	
for(int f:age)	{
System.out.println(f);
}
System.out.println(Arrays.toString(age));	
//int arr[]=null;
//System.out.println(arr.length);
	
}}
