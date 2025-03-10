package com.java.programs;

public class InsertionShort {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,3,2,1,2};
		insertionSort(a);

	}

	public static void insertionSort(int[] a) {
		System.out.println(">>>>> insertionSort <<<<<");
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] >= temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

}
