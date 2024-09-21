package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListSetPractice {
public static void main(String[] args) {
List<Object> data=new ArrayList<>()	;	
data.add(50);
data.add(90);   //To copy data from list and paste in Set
data.add("velan");
data.add(506.24);

Set<Object> setData=new HashSet<>(data);
setData.add(50);
setData.add(50);
setData.add(60);
setData.add(90);
//System.out.println(setData);

ListIterator<Object> li=data.listIterator();
boolean hh=li.hasPrevious();
System.out.println(hh);
while(li.hasPrevious()) {
System.out.println(li.previous());
//if (li.next().equals(90))
//li.remove();
}
//System.out.println(data);
	

}}
