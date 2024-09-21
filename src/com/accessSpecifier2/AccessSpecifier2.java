package com.accessSpecifier2;

import com.accessSpecifier.AccessSpecifier;

public class AccessSpecifier2 extends AccessSpecifier{
	public void method5() {
		int a=10;
		System.out.println(a);}
private void method6() {
int b=20;
System.out.println(b);}
protected void method7() {
	int c=30;
System.out.println(c);}
void method8() {
	int d=40;
System.out.println(d);}
public static void main (String[] args) {
AccessSpecifier2 op =new AccessSpecifier2();
op.method5();op.method6();op.method7();op.method8();
}}



