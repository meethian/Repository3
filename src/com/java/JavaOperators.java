package com.java;

public class JavaOperators { // class created
	public void basicArithmaticOperators() { //method1
	byte a=(-6);
	byte b=3;
	System.out.println("****BASIC ARITHMATIC OPERATORS****");
	System.out.println("Addition:a+b+a+b="+(a+b+a+b));
	System.out.println("Subtraction:a-b-a="+(a-b-a));
	System.out.println("Multiplication:a*b*a="+(a*b*a));
	System.out.println("Division:a/b="+(a/b));
	System.out.println("Modulu:a%b="+(a%b));
	System.out.println("***********************************");}
	public void assignmentOperators() { //method 2
		int a=50;
		int b=5;
		System.out.println("********ASSIGNENT OPERATORS**********");
        System.out.println("Add AND:a+=b: is"+(a+=b));
        System.out.println("Subtract AND:a-=b:is"+(a-=b));
        System.out.println("Multiplication AND:a*=b: is"+(a*=b));
        System.out.println("Division AND:a/=b: is"+(a/=b));
        System.out.println("Modulu AND:a%=b: is"+(a%=b));
        System.out.println("**************************************");}
   public void incrementAndDecrementOperators(){  //method3
	   byte a=5;
	   byte b=10;
	 //  byte c;
	   System.out.println("****INCREMENT AND DECREMENT OPERATORS****");
	   System.out.println("C=a+b+a+++b+++++a+++b:"+(a+b+(a++)+(b++)+(++a)+(++b)));
	   System.out.println("*****************************************");}
   public void ternaryOperator() {//method4
   boolean heavyRain=true;String result;
   result=(heavyRain==false)?"working":"Noworking";
   System.out.println("***********TERNARY OPERATOR**************");
   System.out.println("Heavy Rain:"+result);}
   public static void main(String[] args) { // object 
		JavaOperators object=new JavaOperators();	
object.basicArithmaticOperators();
object.assignmentOperators();
object.incrementAndDecrementOperators();
object.ternaryOperator();}	}
	


