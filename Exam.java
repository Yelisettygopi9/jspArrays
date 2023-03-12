package com.Arrays.Array_pracApp;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int parent[] = new int[n];
		int sub[] = new int[n];
		int c = 0;
		for (int i = 0; i < n; i++) {
			parent[i] = sc.nextInt();
			if (parent[i] != -1) {
				++sub[parent[i]];
			}
		}
		for (int j = 0; j < sub.length; j++) {
			if (sub[j] >= x) {
				++c;
			}
		}
		System.out.println(c);
		sc.close();

	}

}
