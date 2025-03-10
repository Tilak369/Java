package com.java8.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		System.out.println("2.remove duplicate elements from a listusing the stream API and lambda expressions");
		Scanner sc = new Scanner(System.in);
		List<Integer> values = new ArrayList<>();
		while (true) {
			int i = sc.nextInt();
			if (i == 0) {
				break;
			}
			values.add(i);

		}
		distinct(values);
		setDuplicateRemovals(values);
		filterValues(values);
		sc.close();

	}

	private static void filterValues(List<Integer> values) {
		List<Integer> filterValues = values.stream().filter(i -> values.indexOf(i) == values.lastIndexOf(i))
				.collect(Collectors.toList());
		System.out.println("with filter " + filterValues);
	}

	private static void setDuplicateRemovals(List<Integer> values) {
		Set<Integer> newSetValues = values.stream().collect(Collectors.toSet());
		System.out.println("with streams set" + newSetValues);
	}

	private static void distinct(List<Integer> values) {
		List<Integer> newValues = values.stream().distinct().collect(Collectors.toList());
		System.out.println("with streams distinct" + newValues);
	}

}
