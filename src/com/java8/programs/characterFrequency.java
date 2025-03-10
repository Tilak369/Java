package com.java8.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class characterFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		characterFrequencyUsingJava8(name);
		//characterFrequencyeWithOutJava8(name);
		sc.close();

	}

	private static void characterFrequencyUsingJava8(String name) {
		Map<String, Long> characterFrequency = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(characterFrequency);
		
		  Map<Character, Long> collected = name.chars().mapToObj(ch -> (char) ch)
		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		  System.out.println(collected); 
			
			Map<String, Integer> countCharacter = Arrays.stream(name.split("")).collect(Collectors.groupingBy(
					Function.identity(), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
			System.out.println(countCharacter);
			 
		 
	}

}
