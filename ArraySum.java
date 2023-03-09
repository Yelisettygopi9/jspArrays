package com.Arrays.Array_pracApp;
// to find out sum of array elements
public class ArraySum {
	public static void main(String[] args) {
		int ar[]={12,32,24,56,36,81};
		int sum=0; int avg=0;
		
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
			avg=sum/ar.length;	
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}
