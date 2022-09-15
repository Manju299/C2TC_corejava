package com.assignment.org;

import java.util.Scanner;

public class FindtheDiamonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tunnel=1;
		Scanner sc = new Scanner(System.in);
		for (tunnel=1;tunnel<=7;tunnel++) {
			System.out.print("are there diamonds in the tunnel "+tunnel+"\n");
			String foundDiamonds = sc.next();
			if (foundDiamonds.toLowerCase().equals("yes")) {
				System.out.print("Diamonds Found "+tunnel+"\n");
				break;
			
			}
			else {
				continue;
			}
			
			
		}
		if(tunnel==8) {
			System.out.print("there are noo diamonds\n");
		}
		

	}

}
