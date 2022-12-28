package com.tns.dsa.strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		int length = str.length();
		for(int i=0;i<length;i++) {
			for(int j=0;j<=length-i;j++) {
				sub = str.substring(i,i+j);
				System.out.println(sub);
				
				
			}
		}
		
		

	}

	
}
