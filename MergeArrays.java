package com.Arrays.Array_pracApp;

import java.util.Scanner;

//merge two arrays into single one
public class MergeArrays {
	public static void main(String[] args) {
		System.out.println("start");
		int a[]=readArray();
		int b[]=readArray();
		System.out.println("display start");
		displayArray(a);
		displayArray(b);
		int c[]=mergeArray(a,b);
		displayArray(c);
		
		
	}


	private static int[] mergeArray(int[] a, int[] b) {
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length]=b[i];
		}
		
		return c;
	}


	private static void displayArray(int[] ag) {
		for (int i = 0; i < ag.length; i++) {
			System.out.print(ag[i]+" ");
		}
		System.out.println();
	}

	private static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("read array");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		sc.close();
		return ar;
	}
	
	
}
