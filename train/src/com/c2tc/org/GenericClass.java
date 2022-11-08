package com.c2tc.org;

class GenericClass<T>{
	GenericClass(){
		System.out.println("Generic class is created");
	}
	void method(T obj) {
		System.out.println(getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> num = new GenericClass<>();
		Integer a = 5;
		num.method(a);
		GenericClass<String> char1 = new GenericClass<>();
		String name = "Java";
		char1.method(name);
		
	}

}
