package com.tns.assignment;

import java.util.Scanner;

public class MultipleOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 3 == 0) {
			System.out.print("multiple of 3");
		}
		else
			System.out.print("not multiple of 3");

	}

}
