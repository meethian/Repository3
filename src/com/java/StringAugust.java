package com.java;
public class StringAugust {
public static void main(String[] args) {
String a=" Good Morning"	;String b="All is well";
int length=a.length();System.out.println(length);
boolean equal=a.equals(b);System.out.println(equal);
String upper=a.toUpperCase();System.out.println(upper);
boolean equalignore=a.equalsIgnoreCase(upper);System.out.println(equalignore);
String lowercase=upper.toLowerCase();System.out.println(lowercase);
boolean starts=a.startsWith("G");System.out.println(starts);
boolean endsWith=b.endsWith("l");System.out.println(endsWith);
boolean contains=b.contains("well");System.out.println(contains);
int index=a.indexOf("M");System.out.println(index);
int lastindex=b.lastIndexOf("l");System.out.println(lastindex);
char charat=a.charAt(2);System.out.println(charat);
String replace=a.replace('o', 's');System.out.println(replace);
String sub=b.substring(4);System.out.println(sub);
String[] split=a.split("Mo");
for(String newsplit:split) {System.out.println(newsplit);}
boolean isEmpty=a.isEmpty();System.out.println(isEmpty);
String trim=a.trim();System.out.println(trim);
String concat=a.concat(b);System.out.println(concat);
}}