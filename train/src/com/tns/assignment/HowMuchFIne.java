package com.tns.assignment;

import java.util.Scanner;

public class HowMuchFIne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fine;
		System.out.print("Enter the number of over due days: ");
		Scanner sc = new Scanner(System.in);
		int dayOverDue = sc.nextInt();
		if (dayOverDue <=5) {
			fine = dayOverDue*1;
			System.out.println("the fine is "+fine+ " rupees");
			
		}
		else if (dayOverDue>5 && dayOverDue <=10) {
			fine = dayOverDue*5;
			System.out.println("the fine is "+fine+ " rupees");
		
		}
		else {
			fine = dayOverDue*10;
			System.out.println("the fine is "+fine+" rupees");
		}
		

	}

}
