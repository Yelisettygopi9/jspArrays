package com.Arrays.Array_pracApp;
import java.util.Scanner;
public class reversearray{
//	reverse the array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
//		for (int i = ar.length-1; i >=0; i--) {
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();
		int ra[] = reverse(ar);
			for (int i = 0; i < ra.length; i++) {
				System.out.print(ra[i]+" ");
			}
			sc.close();
	}
	private static int[] reverse(int ar[]) {
		int i = 0;
		int j = ar.length - 1;
		while (i < j) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;

		}
		return ar;

	}
}
