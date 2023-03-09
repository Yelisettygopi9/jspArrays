package com.Arrays.Array_pracApp;

import java.util.Scanner;

//read n integer values from user and search specified element in an array and find index value
public class SpEleinArr
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		boolean in=searchArray(ar,ele);
		if(in==false) {
			System.out.println("element is not found");
		}else {
			System.out.println(in);
		}
		sc.close();
	}

	private static boolean searchArray(int[] ar, int ele) {
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==ele) {
				return true;
			}
		}
		return false;
	}

}
