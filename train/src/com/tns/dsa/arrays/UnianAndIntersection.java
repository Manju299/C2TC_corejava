package com.tns.dsa.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnianAndIntersection {
	public static int union(int a[],int b[],int n,int m) {
		HashSet<Integer> set = new HashSet<>();
		for (int i=0;i<n;i++) {
			set.add(a[i]);
		}
		for (int i=0;i<m;i++) {
			set.add(b[i]);
		}
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		return set.size();
		}
	

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int n = a.length;
		int b[] = {1,5,6};
		int m = b.length;
		System.out.println("\n"+ union(a,b,n,m));
			
		
		
	}

}
