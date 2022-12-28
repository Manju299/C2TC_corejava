package com.tns.dsa.strings;

public class FindDuplicatesChar {
	
	static void finddups(String str,int[] count) {
		for(int i =0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}
	
	
	static void printdups(String str) {
		
		int count[] = new int[256];
		finddups(str,count);
		for(int i=0;i<256;i++) {
			if(count[i]>1) {
				System.out.println((char)i+" count = " +count[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		printdups(str);

	}

}
