package com.tns.assignment;

import java.util.Scanner;

public class Positiveornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positive number");
		}
		else if (num < 0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("its zero");
		}

	}

}
