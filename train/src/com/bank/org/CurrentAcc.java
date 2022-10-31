package com.bank.org;

public abstract class CurrentAcc extends BankAcc{
	private final float creaditLimit = 20000;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(float drawBal) {
		if (drawBal <= getAccBal()) {
			float bal = getAccBal();
			bal = bal - drawBal;
			setAccBal(bal);
			System.out.println("withdraw succes.Your Account balance is "+getAccBal());
		}
		else {
			System.out.println("minimum limit crossed balance");
		}
	}
			
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
	

}
