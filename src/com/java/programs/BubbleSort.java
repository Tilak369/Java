package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int i = sc.nextInt();
			if (i == 0)
				break;
			values.add(i);
		}

		// int[] values = { 23, 43, 2, 1, 563, 98 };
		System.out.print("==Before Sorting==");
		// Arrays.stream(values).forEach(n -> System.out.print(n + " "));
		values.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();
		// bubbleSorting(values);
		bubbleSortingScanner(values);
		System.out.print("==After Sorting==");
		// Arrays.stream(values).forEach(n -> System.out.print(n + " "));
		values.stream().forEach(n -> System.out.print(n + " "));
		sc.close();

	}

	private static void bubbleSortingScanner(List<Integer> values) {
		for (int i = 0; i < values.size() - 1; i++) {
			for (int j = 0; j < values.size() - i - 1; j++) {
				if (values.get(j) > values.get(j + 1)) {
					int temp = values.get(j);
					values.set(j, j + 1);
					values.set(j + 1, temp);

				}
			}
		}

	}

	private static void bubbleSorting(int[] values) {
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = 0; j < values.length - i - 1; j++) {
				if (values[j] > values[j + 1]) {
					int temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}

			}

		}

	}

}
