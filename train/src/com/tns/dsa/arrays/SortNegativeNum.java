package com.tns.dsa.arrays;

public class SortNegativeNum {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int arr[] = {1,-3,-4,-2,-5,-1};
		int n = arr.length;
		sortNegtvs(arr,n);
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

	private static void sortNegtvs(int[] arr, int n) {
		
		// TODO Auto-generated method stub
		int j = 0,temp;
		for (int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i !=j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if(arr[0]>arr[j]) {
					temp = arr[0];
					arr[0] = arr[j];
					arr[j] = temp;
				}
				j++;				
			}
			
		}
		
		
	}

}
