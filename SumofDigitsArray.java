package com.Arrays.Array_pracApp;
//every element is replaced by sum of their digits

import java.util.Scanner;

public class SumofDigitsArray 
{public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	
	//read
	for (int i = 0; i < n; i++) {
		ar[i]=sc.nextInt();
	}
	for (int i = 0; i < n; i++) {
		int sum=0;
		int x=ar[i];
		while(x!=0) {
			sum=sum+x%10;
			x=x/10;
		}
		System.out.println(sum);
	}
	sc.close();
}

}
