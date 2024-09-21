import java.util.Scanner;
public class Overloading {	
	
private void method() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a,b value");
	  int a=scan.nextInt();
	  int b=scan.nextInt();
	  if(a>b) {
      System.out.println("method1: a is biger");}
      else {
	  System.out.println("method1: b is bigger");}}
	
private void method(String hai,int a,float b) {
	 if(a<b) {
	 System.out.println("method2: b is biger");}
	 else {
	 System.out.println("method2: b is bigger");}}
private void method (int a,float b,String name) {
	String result;
	result=(a==b)? "a is b":"a is not b";
	System.out.println("Method3:"+result);}
public static void main(String[] args) {
	
	    Overloading object=new Overloading();
			object.method();
			object.method("Method2:", 6, 2);
			object.method(8, 3, null);}
		
					
					
	
				
	
	

	




}