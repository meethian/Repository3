package com.java;

public class Shopping { // class
	public static void main(String[] args) { //main
		boolean gents=true; 
		byte age=34;
		if (gents!=true) { 
			System.out.println("Ladies Section");
		}
		else if(age<3) {
			System.out.println("Infant Section");
		}
		else if(age<=10) {
			System.out.println("Kids Section");
		}
		else if(age>=60) {
			System.out.println("Elderly Section");
		}
		else if (34>=20 && 34<=40) {
			System.out.println("*******meesho online shopping*******");
			System.out.println("Gents Section");
			String dress="Pant";
			long pantSize=38;
			String selection;
			String jean="new item";
			selection=(dress==dress)?"pant":"shirt";
			System.out.println("Product:"+selection);
			if(dress!=jean) {
				System.out.println("Cotton Material");
			}
			else {
				System.out.println("ENDS");
				}
			}
			for( byte a=40; a>=36;a--) {
				System.out.println("SuitableSize:"+a);
				for (int b=5; b<=8;b++) {
					System.out.println("Pant Cost:"+(b*100));}}
					System.out.println("****waiting for customer to select size,price****");}}
				
			
