package com.tns.assignment;

import java.util.Scanner;

public class WaterTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of gallons of water consumed");
		int consumedWater = sc.nextInt();
		if (consumedWater<=45) {
			System.out.println("No Tax ");
		}
		else if (consumedWater>45 && consumedWater<=75) {
			System.out.println("Your Tax "+475);
		}
		else if (consumedWater>75 && consumedWater<=125) {
			System.out.println("Your Tax "+750);
			
		}else if (consumedWater>125 && consumedWater<=200) {
			System.out.println("Your Tax "+1225);
			
		}else if (consumedWater>200 && consumedWater<=350) {
			System.out.println("Your Tax "+1650);
			
		}
		else {
			System.out.println("Your Tax "+2000);
		}
		
		

	}

}
