package com.Arrays.Array_pracApp;


// Delete an element from specified index in an array
public class DelEleArray 
{
	public static void main(String[] args) {
		int ar[]= {25,56,45,78,89};
//					0  1  2  3  4
		int r[]=deleteArray(ar,2);
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]+" ");
		}
	}

	private static int[] deleteArray(int[] x, int in) {
		if(in<0 ||in>=x.length) {
			System.out.println("index not found");
			return x;
		}
		int y[]=new int[x.length-1];
		for (int k = 0; k < y.length; k++) {
			if(k<in) {
				y[k]=x[k];
			}else
			{
				y[k]=x[k+1];
			}
			
		}
		return y;
	}
	
}
