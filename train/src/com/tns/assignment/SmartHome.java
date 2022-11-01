package com.tns.assignment;

import java.util.Scanner;

public class SmartHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub2

		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		if (time > 6 && time < 18) {
			System.out.print("Lughts off");
		}
		else
			System.out.println("Lights on");

	}

}
