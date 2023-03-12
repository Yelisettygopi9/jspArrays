package com.Arrays.Array_pracApp;


//define a method to return n biggest element
//for nth biggest------> before nth biggest n-1 biggest elements are present
public class BigEleArray {
	public static void main(String[] args) {
		int ar[]= {23,45,35,56,29,1,52,74,12,03,72};
		int bg=nthbiggest(ar,3);
		System.out.println("third biggest element "+bg);
		int big=nthbiggest(ar, 4);
		System.out.println("fourth biggest element is "+big);
	}

	private static int nthbiggest(int[] ar, int n) {
		for (int i = 0; i < ar.length; i++) {
			int count=0;
			for (int j = 0; j < ar.length; j++) {
				if(ar[j]>ar[i]) {
					count++;
				}
			}
			if(count==n-1) {
				return ar[i];
			}
		}
		return -1;
	}

}
