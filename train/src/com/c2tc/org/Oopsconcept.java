package com.c2tc.org;

public class Oopsconcept {
	int year_ofpurchase;
	String make;
	int model;
	double cost;
	public void display1() {
		System.out.println("year of purchase " + 2001);
		System.out.println("make " + "Suzuki");
		
	}
	void display() {
		System.out.print("model" + 2001);
		System.out.print("cost" + 20000000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oopsconcept ob1 = new Oopsconcept();
		ob1.display1();

	}

}
