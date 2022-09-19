package com.c2tc.org;

public class Sub extends SuperClass{
	int var = 50;
	void disp() {
		System.out.print(var);
		System.out.print(super.var);
	}

	public static void main(String[] args) {
		Sub sc = new Sub();
		sc.disp();
	}
	}
	

