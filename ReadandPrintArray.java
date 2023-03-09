package com.Arrays.Array_pracApp;

import java.util.Scanner;

public class ReadandPrintArray
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		//reading elements in to an array
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println();
		//forward direction 
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		//backward direction
		for (int i = ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		sc.close();
	}

}
