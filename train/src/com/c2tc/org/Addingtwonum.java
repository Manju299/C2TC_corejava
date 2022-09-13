package com.c2tc.org;

import java.util.Scanner;

public class Addingtwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ex;
		do {
		System.out.println("Enter the number1");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		// int res = a + b;
		// System.out.println("the sum is " +res);
		
		System.out.println("Eneter your choice \n "
				+ "1 : addition "
				+ "2 : subtraction "
				+ "3 : multiplication "
				+ "4 : division "
				+ "5 : quit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("this is result is " +(a+b));
				System.out.println();
				break;
		case 2:	 System.out.println("this is result is " +(a-b));
				break;
		case 3:
			 System.out.println("this is result is " +(a*b));
			 break;
		case 4 :
			 System.out.println("this is result is " +(a/b));
			 break;
		case 5:
			 System.out.println("Invalid option");
			 break;
		}
		System.out.println("you wnat to continue\n 1:yes\n 0:no");
		ex = sc.nextInt();
		}while (ex ==1);
		
		
		}
			
	}

	


