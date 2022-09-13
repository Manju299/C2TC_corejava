package com.c2tc.org;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char Gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mno = sc.nextLong();
		System.out.println("Name " +name);
		System.out.println("gender " +Gender);
		System.out.println("Age " +age);
		System.out.println("mobile no " +mno);
		
	}

}
