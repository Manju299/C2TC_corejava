package com.tns.assignment;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n  = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print(" "+i+" ");
		}

	}

}
