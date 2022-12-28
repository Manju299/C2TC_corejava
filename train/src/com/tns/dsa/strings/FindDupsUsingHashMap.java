package com.tns.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDupsUsingHashMap {
	static void printDups(String str) {
		HashMap<Character,Integer> count = new HashMap<>();
		for(int i =0;i<str.length();i++) {
			if(!count.containsKey(str.charAt(i))) {
				count.put(str.charAt(i), 1);
			}
			else {
				count.put(str.charAt(i), count.get(str.charAt(i)) +1);
			}
		}
		for(Map.Entry element:count.entrySet()) {
			char key = (char)element.getKey();
			int value = (int)element.getValue();
			
		}
		// incomplete program 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld Hi";
		printDups(str);

	}

}
