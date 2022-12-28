package com.tns.dsa.arrays;

public class ToCheck2ArrayisEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		boolean flag = true;
		if(arr1.length == arr2.length) {
			for(int i=0 ;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					flag=false;
				}
			}
		}
		if(flag) {
			System.out.println("Arrays are equal");
			
		}
		else {
			System.out.print("Not equal");
		}
		
		

	}

}
