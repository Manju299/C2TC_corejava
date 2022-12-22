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
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
		System.out.println(set);
		return set.size();
		}
	public static void intersection(int a[],int b[],int n,int m) {
		HashSet<Integer> set1 = new HashSet<>();
		for (int i= 0;i<n;i++) {
			set1.add(a[i]);
		}
		for (int i = 0;i<m;i++) {
			if(set1.contains(b[i])) {
				System.out.print(b[i]+" ");
			}
		}
		
		
		
	}
	

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int n = a.length;
		int b[] = {1,5,6,4};
		int m = b.length;
		intersection(a,b,n,m);
			
		
		
	}

}
