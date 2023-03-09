package com.Arrays.Array_pracApp;

import java.util.Scanner;

public class NoEvOdinArr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		// reading elements in to an array
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int even=0,odd=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0) {
				even++;

			}
			else {
				odd++;
			}
		}
		System.out.println("even is"+even);
		System.out.println("odd is"+odd);
		sc.close();
	}

}
