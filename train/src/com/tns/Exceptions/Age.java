package com.tns.Exceptions;

import java.util.Scanner;

public class Age {
	private static int age;
	static void validate()throws InvalidAgeException{
	Scanner sc =new Scanner(System.in);
	System.out.print("enter your age");
	age = sc.nextInt();
	if(age<18)
		throw new InvalidAgeException("Invalid age,your are not");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validate();
		}
		catch(Exception e) {
			System.out.println("Caught an exception");
		}

	}

}
