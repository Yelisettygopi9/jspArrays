package com.Arrays.Array_pracApp;

import java.util.Scanner;

// 2  sorted arrays merge into single sorted arrays 
public class SortMergeArray {
	public static void main(String[] args) {
		System.out.println("start");
		int a[] = readArray();
		int b[] = readArray();
		System.out.println("display start");
		displayArray(a);
		displayArray(b);
		int c[] = MergeSort(a, b);
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

	private static int[] MergeSort(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
			
		}
		return c;
	}
}
