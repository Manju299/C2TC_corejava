package com.tns.dsa;

public class ReverseNum {
	
	public static void reverse(int number) {
		if(number<10) {
			System.out.print(number);
			return;
		}
		else {
			System.out.print(number%10);
			reverse(number/10);
		}
		
	}
	public static void main(String Args[]) {
		int num = 123;
		reverse(num);
	}

}
