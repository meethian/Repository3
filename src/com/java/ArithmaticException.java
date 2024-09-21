package com.java;
import java.util.Arrays;
public class ArithmaticException {
public static void main(String[] args) {
int arr[]=null;
int a=10;
int b=0;


try {
	int c=a/b;
	//System.out.println(c);
//System.out.println(arr.length);
System.out.println("try method");
} catch (ArrayIndexOutOfBoundsException e) {		
System.out.println("Null poiter Exception:"+e);	
}catch (StringIndexOutOfBoundsException e) {
System.out.println("over");
}catch (IndexOutOfBoundsException e) {
	System.out.println("index");
}catch (ArithmeticException e) {
System.out.println("Arith"+e);	
}catch (NumberFormatException e) {
}catch(NullPointerException e) {
System.out.println("Null Pointer"+e);	
}
System.out.println("pgm over");
}
}
