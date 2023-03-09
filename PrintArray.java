package com.Arrays.Array_pracApp;

public class PrintArray{
	public static void main(String[] args) {
		int ar[]= {34,66,12,25,72,32,74};
		//forward direction
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("alekhya");
//		backward direction
		for (int i = ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		//for each
		for (Object ag:ar) {
			System.out.print(ag+" ");
		}
	}

}
