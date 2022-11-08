package com.tns.dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(4);
		Collections.sort(ar,Collections.reverseOrder(null));
		System.out.print(ar);
		

	}

}
