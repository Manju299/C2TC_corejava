package com.bank.org;

public class MMBankFactory extends BankFactory { 
	
	public  MMSavingAcc getNewSavingAcc(int AccNo,String accNm, float accBal,boolean isSalaried) {
		
		return new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
	}

	
	public MMCurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAcc(AccNo, accNm, creditLimit, creditLimit);
	}
	
	
	
		
}

