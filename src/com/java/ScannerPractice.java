package com.java;
import java.util.Scanner;

public class ScannerPractice {
	
public static void main (String[] args) {
	
	Scanner pongalTicket=new Scanner(System.in);
	System.out.println("enter departurePlace");
	String departurePlace=pongalTicket.nextLine();
	//System.out.println("enter destination ");
	String destinationPlace=pongalTicket.next();
	
	//System.out.println("enter type of seat:");
	String seattype =pongalTicket.next();
	
	switch (seattype) {
		case "Seater":
			String type1="Seater";
			System.out.println("Price is 650");
			break;
		case "Sleeper":
			String type2="Sleeper";
			System.out.println("Price is 1000");
			break;
	default:
		break;
	
	}
}}