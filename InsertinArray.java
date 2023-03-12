package com.Arrays.Array_pracApp;


// insert the element in the specified index of the given array
public class InsertinArray 
{
	public static void main(String[] args)
	{
		int ar[]= {23,45,16,85,74};
		ar=insertArray(ar,39,2);
		for (int i = 0; i <ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static int[] insertArray(int[] x, int ele, int in) {
		if(in<0 ||in>=x.length)	{
			System.out.println("index values are not valid");
			return x;
		}
		int y[]=new int[x.length+1];
			y[in]=ele;
			for (int k = 0; k <y.length; k++) {
				if(k<in) {
					y[k]=x[k];
				}else {
					y[k+1]=x[k];
				}
			}
			return y;
		
	}

}
