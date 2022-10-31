package com.bank.org;

public class MMSavingAcc extends SavingAcc {
	
	
	public MMSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		
		// TODO Auto-generated constructor stub
	}

	private static final float MINBAL = 500;

	
	
	@Override
	public void withdraw(float drawBal) {
		// TODO Auto-generated method stub
		super.withdraw(drawBal);
	}



	@Override
	public String toString() {
		return  super.toString();
	}
	
	
}
