package com.c2tc.org;

class AccessSpecifiers {
	protected int a=10;
	protected int b=20;
	protected int result = a+b;
	
}
class b extends AccessSpecifiers {
	public static void main(String[] args) {
		b ob = new b();
		System.out.print(ob.result);
	}
}