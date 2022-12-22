package com.tns.dsa;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String reverse = "";
		for (int i=0;i<str.length();i++) {
			reverse = str.charAt(i)+reverse; 
		}
		if(str.equals(reverse)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.print(" Not Pallidromme");
		}

	}

}
