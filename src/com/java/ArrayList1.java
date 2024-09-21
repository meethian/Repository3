package com.java;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
public class ArrayList1 {
public static void main(String[] args) {
List<String> a=new ArrayList<>();
List<String> c=new LinkedList<>();
List<String> b=new Vector<>();
c.add("1");c.add("2");c.add("3");
b.add("a");b.add("b");b.add("c");
a.add("A");a.add("B");a.add("C");a.add("D");//method1
System.out.println(a);System.out.println(b);System.out.println(c);
int size=a.size();System.out.println(size);	//method2
String get=a.get(2);System.out.println(get);//method3
String set=b.set(2, "d");System.out.println(set);//method4
System.out.println(b);
String remove=c.remove(0);System.out.println(remove);//method5
boolean addAll=a.addAll(b);System.out.println(addAll);//method6
System.out.println(a);
boolean removeAll=a.removeAll(b);System.out.println(removeAll);	//method7
//System.out.println(a);
boolean addall=a.addAll(b);
//System.out.println(a);System.out.println(b);
boolean retainAll=a.retainAll(b);System.out.println(retainAll);//method8
//System.out.println(a);
//a.clear(); 
boolean con=a.contains(1);
//method9
System.out.println(con);}}