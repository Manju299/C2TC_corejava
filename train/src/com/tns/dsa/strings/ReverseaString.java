package com.tns.dsa.strings;

public class ReverseaString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		char[] ch = str.toCharArray();
		int left,right = 0;
		right = ch.length - 1;
		for (left=0;left<right;left++,right--) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		}
		for (char c:ch)
		{
			System.out.print(c);
		}
		
		
	}

}
