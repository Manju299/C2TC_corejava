package com.tns.dsa;

import java.util.Scanner;

public class AddTwoMatx {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of cols and rows ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int first[][] = new int[n][m];
		int second[][] = new int[n][m];
		int sum[][] = new int[n][m];
		System.out.println("Enter the first matix");
		for (int c = 0; c<n;c++) {
			for (int d =0;d<m;d++) {
				first[c][d] = sc.nextInt();
				
			}
		}
		
		System.out.println("Enter the Second matix");
		for (int c = 0; c<n;c++) {
			for (int d =0;d<m;d++) {
				second[c][d] = sc.nextInt();
				
			}
		}
		
		
		System.out.println("The sum matix");
		for (int c = 0; c<n;c++) {
			for (int d =0;d<m;d++) {
				sum[c][d] = first[c][d] + second[c][d];
				
			}
		}
		
		System.out.println("The sum matix is");
		for (int c = 0; c<n;c++) {
			for (int d =0;d<m;d++) {
				System.out.println(sum[c][d] + "\t");
				
			}
		}
		
		
	}

}
