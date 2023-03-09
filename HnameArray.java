package com.Arrays.Array_pracApp;


public class HnameArray {
	public static void main(String[] args) {
		String str[]= {"yogadeepika","alekhya","radha","lakhshmi","srinu"};
		//				0       1          2       3          4
		String hname=str[0];
		for (int i = 1; i < str.length; i++) {
			if (hname.length()>str[i].length()) {
					hname=str[i];
			}
		}
		System.out.println("highest name "+hname);
	}
}
