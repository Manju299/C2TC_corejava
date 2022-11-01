package com.tns.assignment;

import java.util.Scanner;

public class DiamondsandSnakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tunnel;
		Scanner sc = new Scanner(System.in);
		
		for(tunnel=1;tunnel<=7;tunnel++) {
			System.out.println("Entering the tunnel "+tunnel);
			System.out.println("are Snakes:enter true or false ");
			boolean areSnakes = sc.nextBoolean();
			

			if(areSnakes==false) {
				System.out.println("are Diamonds are there:enter true or false");
				boolean arediamonds = sc.nextBoolean();
				if (arediamonds==false) {
					System.out.println("diamonds found");
					break;
				}
			}else {
				continue;
			}
		}
		

	}

}
