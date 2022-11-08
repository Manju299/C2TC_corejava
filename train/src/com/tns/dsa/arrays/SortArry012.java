package com.tns.dsa.arrays;

public class SortArry012 {
	public static void sort(int a[],int n) {
		int low = 0,	mid = 0,high = n - 1;
		while (mid <= high) {
			if(a[mid] == 0) {
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
			}
			else if(a[mid] == 1) {
				mid++;
			}
			else if(a[mid] == 2) {
				int temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				high --;
			}
			
		}
	}
	 public static void printArr(int arr[] ,int n) {
		 for(int i=0; i<n;i++) {
			 System.out.print(arr[i] + " ");
			 
		 }
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,2,2,0,2,1,1};
		int n = 8;
		System.out.println("Before sort " );
		printArr(arr,n);
		sort(arr,n);
		System.out.println("\nAfter sorting ");
		printArr(arr,n);
		int a=5;
		int b = ++a;
		System.out.println(b);
	}

}
