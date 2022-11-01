package com.tns.static1;

public class Newblock {
	{
		System.out.println("instace 1");
	}
	{
		System.out.println("instace 2");
	}
	static 
		{
			System.out.println("static 1");
		}
	static 
	{
		System.out.println("static 2");
	}
	Newblock(){
		
			System.out.println("constructre 1");
	
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newblock b1 =new Newblock();
		

	}

}
