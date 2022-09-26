package com.interface1;
interface a {
	void msg();
}

public class InterfaceExample implements a{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("this is message");
	}
	void show () {
		System.out.println("this is show method");
	}
	public static void main(String [] args) {
		InterfaceExample e = new InterfaceExample();
		e.msg();
		e.show();
		a a1 = new InterfaceExample();
		a1.msg();
	}
	

}
