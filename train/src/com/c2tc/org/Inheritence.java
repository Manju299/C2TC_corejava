package com.c2tc.org;

class Withdraw {
	int amt_withdraw = 2000;
}
public class Inheritence extends Withdraw{
	int amt_left = 5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence ob1 = new Inheritence();
		System.out.println("Amount withdr " + ob1.amt_withdraw);
		
	}

}
