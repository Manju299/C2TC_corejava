package com.bank.org;

public abstract class SavingAcc extends BankAcc{
	
	private boolean isSalaried = true;
	private static final float MINBAL = 500;

	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(float drawBal) {
		if (drawBal >= MINBAL && drawBal <= getAccBal()) {
		float bal = getAccBal();
		bal = bal - drawBal;
		setAccBal(bal);
		System.out.println("withdraw succes.Your Account balance is "+getAccBal());

	}
	else {
		System.out.println("less than minimum balance");
	}}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
