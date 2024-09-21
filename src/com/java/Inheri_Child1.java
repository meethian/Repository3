package com.java;
public class Inheri_Child1 extends Inheri_Parent {
public void school(String name,int gate) {
name="ravi";gate=4;	
System.out.println(name+";"+gate);}
protected void school(int age,String section) {
	age=10;section="3-A";
System.out.println(age+";"+section);}	
public static void main(String[] args) {
Inheri_Child1 parent=new Inheri_Child1();
parent.function();parent.school("raju",5);
parent.school(14,"1-B");
}}

