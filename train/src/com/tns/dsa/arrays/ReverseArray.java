package com.tns.dsa.arrays;

public class ReverseArray {
	static void reverse(int arr[], int start,int end) {
		int temp;
		while(start < end) { 
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	static void print(int arr[],int size) {
		for (int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		print(arr,5);
		reverse(arr,0,4);
		
		System.out.println("\nReversed array is");
		print(arr,5);
		

	}

}
