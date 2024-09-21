package com.accessSpecifier;

public class AccessSpecifier {
	public void method1() {
		int a=5;
		System.out.println(a);}
private void method2() {
int b=3;
System.out.println(b);}
protected void method3() {
	int c=6;
System.out.println(c);}
void method4() {
	int d=9;
System.out.println(d);}
public static void main (String[] args) {
AccessSpecifier op =new AccessSpecifier();
op.method1();op.method2();op.method3();op.method4();}}

