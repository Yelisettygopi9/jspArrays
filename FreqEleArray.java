package com.Arrays.Array_pracApp;

public class FreqEleArray {
	public static void main(String[] args) {
		int ar[]= {23,12,24,69,87,91,12,45,45,24};
		printFreq(ar);
	}

	private static void printFreq(int[] ar) {
		boolean br[]=new boolean[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			int count=1;
			if(br[i]==false) {
				
				for (int j = i+1; j < ar.length; j++) {
					
					if(ar[i]==ar[j]) {
						count++;
						br[j]=true;
					}
				}
				System.out.println(ar[i]+"-------->"+count);
				
			}
		}
	}

}
