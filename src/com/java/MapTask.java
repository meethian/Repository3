package com.java;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Set;
public class MapTask {
public static void main(String[] args) {
Map<String,Boolean> type1=new HashMap<>();
Map<Integer,Float> type2=new LinkedHashMap<>();
Map<Double,Long> type3=new TreeMap<>();
type1.put("good",true);type1.put("bad",false);System.out.println(type1);//method1
type2.put(1, 1.001f);type2.put(2, 2.002f);System.out.println(type2);
type3.put(2.0002, 10000l);type3.put(3.0003, 20000l);System.out.println(type3);
int size=type1.size();System.out.println(size);//method2
float get=type2.get(1);System.out.println(get);//method3
Set<String> keySet=type1.keySet();
System.out.println(keySet);//method4
Collection<Long> values=type3.values();System.out.println(values);//method5
boolean containskey=type1.containsValue(true);System.out.println(containskey);
boolean empty=type2.isEmpty(); System.out.println(empty);//method6,method7
type3.clear();
System.out.println(type3);//method8


}}
