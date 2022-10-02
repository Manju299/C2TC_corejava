package com.tns.weekassignment;

public class Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 7;
		boolean isPrime = true;
		for (int i=2;i<number/2;i++) {
			if(number%i==0) {
				isPrime = false;
			}
		}
		if(isPrime == true) {
			System.out.println("The number is a prime number");
			
		}
		else {
			System.out.println("The number is not prime number");
		}

	}

}
