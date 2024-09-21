package com.java;

public class Blocks extends Block_1 {
	Blocks(){ //constructor
		System.out.println("first constructor");
	        }
static {
		System.out.println("static block");
		//System.out.println('G'+'a');
		
		int a=154;byte b =127;
		b=(byte)a;
		System.out.println(b);
	   }
{
System.out.println("instance block");
}
private void method_1() {
System.out.println("method1");
}
public static void main(String[] args) {
//new Blocks().method_1();;
}}
class Block_1 {
{
System.out.println("instance block-2");		
}
static {
	System.out.println("second static block");
       }
Block_1(){ //constructor-2
	System.out.println("second constructor");
}}


