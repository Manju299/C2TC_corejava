package com.tns.dsa.arrays;

public class FindLargcontarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,-3,-2,-7,-5};
		int n = arr.length;
		System.out.println(findlargest(arr,n));

	}

	public static int findlargest(int[] arr, int n) {
		// TODO Auto-generated method stub
		int maxh = 0;
		int maxf = arr[0];
		for(int i = 0;i<n;i++) {
			maxh+=arr[i];
			
			if(maxf<maxh)
				maxf = maxh;
			if(maxh<0)
				maxh = 0;
		}
		return maxf;
	}

}
