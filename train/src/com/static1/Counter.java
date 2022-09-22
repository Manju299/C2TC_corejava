package com.static1;

public class Counter {
	static int x = 0;
	Counter() {
		x++;
	}
	void disp() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		c1.disp();
		Counter c2 = new Counter();
		c2.disp();
		Counter c3 = new Counter();
		c3.disp();

	}
}
