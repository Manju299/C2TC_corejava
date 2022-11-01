package com.tns.assignment;

public class WeeklyTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temprature  = 30;
		int weeks = 5;
		int final_temp = temprature-((weeks-1)*2);
		System.out.println("Final temp should be " + final_temp);
		for  (int i=1;i<=5;i++) {
			
			System.out.println("week " +i+ " "+temprature);
			temprature-=2;
		}

	}

}