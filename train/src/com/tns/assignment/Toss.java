package com.tns.assignment;

import java.util.Scanner;

public class Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String toss = sc.nextLine();
		if (toss.toLowerCase().equals("heads")) {
			System.out.println("Heads");
		}
		else {
			System.out.println("Tails");
		}
		
		

	}

}
