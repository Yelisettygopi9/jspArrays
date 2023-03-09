package com.Arrays.Array_pracApp;

import java.util.Scanner;

// to read n integer values from user and print how many prime numbers in that
public class FindprimeinArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//to give size of an array
		int n=sc.nextInt();
		int ar[]=new int[n];
		//read n integer elements in to an array
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int cp=CountPrimenumbers(ar);
		System.out.println(cp);
		sc.close();
	}

	private static int CountPrimenumbers(int[] ar) {
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			boolean rs=Isprime(ar[i]);
			if(rs==true) {
				count++;
			}
		}
		return count;
	}

	private static  boolean Isprime(int x) {
		for (int j = 2; j <=x/2; j++) {
			if(x%j==0) {
				return false;
			}
			
		}
		return true;
	}

}
