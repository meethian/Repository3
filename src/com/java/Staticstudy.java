package com.java;
public class Staticstudy {
	int age=30;
	short carNumber=1000;
static byte luckyNumber=15;
    static float markPercentage= 72.5f;
    static char initial='S';
   String name;
    public void method_1() {
    	name="Raja";
    //	System.out.println(name);
    	String name="Kamal";
    	int age;
    	luckyNumber=10;
    //	int luckyNumber=20;
    	System.out.println(luckyNumber);
    System.out.println(name);}
     private void method_2() {
    	System.out.println(name);
    //	float markPercentage=82.5f;
    	float markPercentage=62.5f;}
// System.out.println(markPercentage);
    public static void main(String[] args) {
    	//int age=20;
    	Staticstudy you = new Staticstudy();
    	System.out.println(you.name);
    	you.method_1();
    	System.out.println(markPercentage);
    	you.method_2();
    	//System.out.println(you.name);
    //	System.out.println(age);
    	
}
}