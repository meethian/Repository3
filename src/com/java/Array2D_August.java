package com.java;
public class Array2D_August {
public static void main(String[] args) {
int[][]	marks= {{10,20,30},{15,25,35,45}};
System.out.println(marks.length);
System.out.println(marks[0][0]+";"+marks[0][1]+";"+marks[0][2]+";"+marks[1][0]+";"+marks[1][1]+";"+marks[1][2]+";"+marks[1][3]);		
System.out.println("-----For loop----");
for(int i=0;i<marks.length;i++)	{
for(int j=0;j<marks[i].length;j++)	{
System.out.print(marks[i][j]+" ");	}
System.out.println();}
System.out.println("-----Uncontrol loop----");
for(int[] z: marks) {
for(int x:z) {
System.out.print(x+" ");	
}
}
}}
