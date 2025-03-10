package com.java8.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class separationOfEvenOddNumbers {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); //List<Integer> oneToTen = new
		 * ArrayList<>(); while (true) { // System.out.println("Enter the values"); int
		 * value = sc.nextInt(); if (value == 0) { break; } oneToTen.add(value);
		 * 
		 * }
		 */
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		byfilters(oneToTen);
		separationOfEvenOddNumberInMap(oneToTen);
		separationOfEvenOddNumberInList(oneToTen);
		//sc.close();
	}

	private static void separationOfEvenOddNumberInList(List<Integer> oneToTen) {
		 
		Collection<List<Integer>> evenOddList = oneToTen.stream()
				.collect(Collectors.collectingAndThen(Collectors.partitioningBy(i -> i % 2 == 0), Map::values));
		
		
		System.out.println(evenOddList);
		
	}

	private static void byfilters(List<Integer> oneToTen) {
		List<Integer> newEvenOddList = oneToTen.stream().filter(E -> E %2 ==0).collect(Collectors.toList());
		System.out.println(newEvenOddList);
	}

	private static void separationOfEvenOddNumberInMap(List<Integer> oneToTen) {
		// List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println(evenAddOddSeparation);
	}
}
