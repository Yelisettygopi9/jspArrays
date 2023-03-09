package com.Arrays.Array_pracApp;

import java.util.Scanner;

public class SmallEleInArr {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		double ar[]=new double[n];
		//reading elements in to an array
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextDouble();
		}
//		int big=ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if(ar[i]>big) {
//				big=ar[i];
//			}
//		}
//		System.out.println(big);
		double small=ar[0];
		for (int i = ar.length-1; i >=1; i--) {
			if(ar[i]<small) {
				small=ar[i];
			}
		}
		System.out.println(small);
		sc.close();
	}

}
