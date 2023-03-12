package com.Arrays.Array_pracApp;

public class InsertEleSpeciArray {
	public static void main(String[] args) {
		int ar[] = { 34, 56, 23, 67, 89 };
		int br[] = { 11, 12, 13 };
		int ins[]=inserArray(ar, br, 2);
		for (int i = 0; i < ins.length; i++) {
			System.out.print(ins[i]+" ");
		}
	}

	private static int[] inserArray(int[] x, int[] y, int in) {
		if (in < 0 || in >=x.length) {
			System.out.println("index is not in range");
			return x;
		}
		int z[] = new int[x.length + y.length];
		for (int i = 0; i < y.length; i++) {
			z[i+in]=y[i];
		}
		for (int i = 0; i < x.length; i++) {
			if (i < in) {
				z[i] = x[i];
			}
			else {
				z[i+y.length]=x[i];
			}
		}
		return z;
	}

}
