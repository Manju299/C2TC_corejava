package com.tns.dsa.arrays;

public class MinMaxArray {
	
	static class Pair {
		int min;
		int max;
	}
	
	static Pair getMinMax(int arr[],int n) {
		Pair minmax = new Pair();
		int i;
		if (n==1 ) {
			minmax.min = arr[0];
			minmax.max = arr[0];
			return minmax;
			}
		if(arr[0]<arr[1]) {
			minmax.max = arr[1];
			minmax.min = arr[0];
			}
		else {
			minmax.max = arr[0];
			minmax.min = arr[1];
		}
		for (i = 2; i < n; i++) {
			if (arr[i] > minmax.max ) {
				minmax.max = arr[i];
				}
			else if (arr[i]< minmax.min) {
				minmax.min =arr[i];
			}
		}
		
		return minmax;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int size = 5;
		Pair minmax = getMinMax(arr,size);
		System.out.println(minmax.min);
		System.out.println(minmax.max);
		

	}

}

