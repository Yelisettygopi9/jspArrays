package com.Arrays.Array_pracApp;

import java.util.Scanner;

//merge arrays in zigzag 
public class ZigzagArray {
	public static void main(String[] args) {
		System.out.println("start");
		int a[] = readArray();
		int b[] = readArray();
		System.out.println("display start");
		displayArray(a);
		displayArray(b);
		int c[] = ZigzagArray(a, b);
		displayArray(c);
	}
	private static void displayArray(int[] ag) {
		for (int i = 0; i < ag.length; i++) {
			System.out.print(ag[i] + " ");
		}
		System.out.println();
	}
	private static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("read array");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		return ar;
	}
	private static int[] ZigzagArray(int[] a, int[] b) {
		int c[]=new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length&&i<b.length) {
			c[k]=a[i];
			k++;
			c[k]=b[i];
			k++;
			i++;
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length) {
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
		
	}

}
