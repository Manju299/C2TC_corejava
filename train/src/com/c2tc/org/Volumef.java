package com.c2tc.org;

public class Volumef {
	int vol (int r) {
		return r*r*r;
	 
	}
	int vol (int l,int b,int h) {
		
		return  l*b*h;
	}
	double vol(double r) {
		double res = (4/3*3.14*r*r*r);
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volumef sc = new Volumef();
		System.out.println(sc.vol(2,3,4));
		System.out.println(sc.vol(2.1));
		System.out.println(sc.vol(4));
		
	}

}
