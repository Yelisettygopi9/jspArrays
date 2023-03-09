package com.Arrays.Array_pracApp;


public class BigamongArray {
	public static void main(String[] args) {
		int ar[]= {45,55,65,74,72,12,1111,0,12};
		int big=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]>big) {
				big=ar[i];
			}
		}
		System.out.println(big);
	}

}
