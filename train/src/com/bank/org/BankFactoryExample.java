package com.bank.org;

import java.util.Scanner;

public class BankFactoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory b1 = new MMBankFactory();
		//Initially tested using this commented code
//		MMCurrentAcc mmsc = b1.getNewCurrentAcc(2, "Manju", 10000,20000);
//		mmsc.withdraw(20000);
//		System.out.println(mmsc.getAccBal());
//		System.out.println(mmsc.toString());
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 => SavingsAccount \n"
				+ "2 => CurrentAccount \n"
				+ "3 => Quit");
		System.out.println("\nEnter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("\nEnter your Details");
			
			System.out.println("Enter account number");
			int acc = sc.nextInt();
			System.out.println("Enter account name");
			String name = sc.next();
			System.out.println("Enter account balance");
			float bal = sc.nextFloat();
			System.out.println("are you salaried is yes type true");
			boolean sal = sc.nextBoolean();
			MMSavingAcc mmsc = b1.getNewSavingAcc(acc,name,bal,sal);
			System.out.println("Your Account balance is " +mmsc.getAccBal());
			System.out.println("Enter the amount you want withdraw");
			int widr = sc.nextInt();
			mmsc.withdraw(widr);
			break;
		case 2 :
			System.out.println("\nEnter your Details");
			
			System.out.println("Enter account number");
			int acc1 = sc.nextInt();
			System.out.println("Enter account name ");
			String name1 = sc.next();
			System.out.println("Enter account balance");
			float bal1 = sc.nextFloat();
			System.out.println("Enter account creaditlimit");
			float sal1 = sc.nextFloat();
			MMCurrentAcc mmca = b1.getNewCurrentAcc(acc1,name1,bal1,sal1);
			System.out.println("Your Account balance is " +mmca.getAccBal());
			System.out.println("Enter the amount you want withdraw");
			int widr1 = sc.nextInt();
			mmca.withdraw(widr1);
			break;
		case 3 :
			System.exit(0);
		default :
			 System.out.println("Invalid Option");
		
			
		}
	}

}
