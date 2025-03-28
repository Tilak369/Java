package com.java8.programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Programs {

	public static void main(String[] args) {

		System.out.println("1.the odd and even numbers into two separate lists.");

		System.out.println("****************Strart**********separationOfEvenOddNumberInMap***************************************");
		separationOfEvenOddNumberInMap();
		separationOfEvenOddNumberInList();
		System.out.println("****************End**********separationOfEvenOddNumberInMap***************************************");
		System.out.println("2.remove duplicate elements from a listusing the stream API and lambda expressions");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		removeDuplicateFromList();
		System.out.println("****************End**********removeDuplicateFromList***************************************");
		System.out.println(	" 3.  Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors:");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		characterFrequency();
		System.out.println("****************End**********removeDuplicateFromList***************************************");
		System.out.println(" 4. Write a Java 8 program to find the frequency of  each element in an array or a list using streams and collectors  ");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		wordFrequency();
		System.out.println("5. Write a Java 8 program to sort a given list of decimal numbers in reverse order.\r\n");
		System.out.println("****************Start**********ReverseStringUsingStream***************************************");
		reverseSortedList();
		ReverseStringUsingStream();
		System.out.println(" 6.  Given a list of strings, write a Java 8 program to join the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.\r\n");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		joinListOfStrings();
		System.out.println("7.* Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.");
		System.out.println("****************Start**********multipleOf5***************************************");
		multipleOf5();
		System.out.println(" 8. * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.\r\n");
		System.out.println("****************Start**********minMaxFromList***************************************");
		minMaxFromList();
		System.out.println(" 9.* Write a Java 8 program to merge two unsorted arrays into a single-sorted array using the stream API.\r\n");
		System.out.println("****************Start**********mergeUnsortedArrayIntoSorted***************************************");
		mergeUnsortedArrayIntoSorted();
		System.out.println(" 11.* Write a Java 8 program to merge two unsorted arrays into a single-sorted array without duplicates.\r\n");
		System.out.println("****************Start**********mergeUnsortedArrayIntoSortedWithoutDuplicate***************************************");
		mergeUnsortedArrayIntoSortedWithoutDuplicate();
		System.out.println(" 11.* Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.\r\n");
		System.out.println("****************Start**********min3max3***************************************");
		min3max3();
		System.out.println(" 12. * Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.\r\n");
		System.out.println("****************Start**********isAnagram***************************************");
		isAnagram();
		isAnagram2();
		System.out.println(" 13 * Write a Java 8 program to find the sum of all digits of a given number");
		System.out.println("****************Start**********sumOf***************************************");
		sumOf();
		System.out.println(" 14.  Write a Java 8 program to find the second-largest number in an integer array\r\n");
		System.out.println("****************Start**********secondLargestNumberFromList***************************************");
		secondLargestNumberFromList();
		System.out.println(" 15.  Write a Java 8 program to sort a given list of strings according to the increasing order of their length.\r\n");
		System.out.println("****************Start**********sortByLengthOfList***************************************");
		sortByLengthOfList();
		System.out.println(" 16.   * Write a Java 8 program to find the sum and average of all elements in an integer array.");
		System.out.println("****************Start**********calculateAndSumAndAverage***************************************");
		calculateAndSumAndAverage();
		System.out.println(" 17. Find the common elements between two arrays\r\n");
		System.out.println("****************Start**********commonElements***************************************");
		commonElements();
		System.out.println(" 18.* Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions\r\n");
		System.out.println("****************Start**********sortByLengthOfList***************************************");
		reverseEachWord();
		System.out.println(" 19.  * Write a Java 8 program to find the sum of the first 10 natural numbers using streams.\r\n ");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		int sumOf10NaturalNumber = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sumOf10NaturalNumber);
		System.out.println(" 21. * Write a Java 8 program to reverse an integer array.");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		reversedArray();
		System.out.println(" 22.  * Write a Java 8 program to find the most repeated element in an array.");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		mostRepeatedElement();
		System.out.println(" 23.  * Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.");
		System.out.println("****************Start**********checkIsTheStringPalindrome***************************************");
		checkIsTheStringPalindrome();
		System.out.println(" * Given a list of strings, write a Java 8 program to find the strings that start with a number. ");
		System.out.println("****************Start**********stringsStartsWithNumber***************************************");
		stringsStartsWithNumber();
		System.out.println(" * Write a Java 8 program to extract duplicate elements from an array.");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		extractDuplicateElements();
		System.out.println(" 26.* Write a Java 8 program to print the duplicate characters in a string.");
		System.out.println("****************Start**********removeDuplicateFromList***************************************");
		duplicateCharactersInString();
		System.out.println(" 27.* Write a Java 8 program to find the first repeated character in a string.");
		System.out.println("****************Start**********firstRepeatedCharacter***************************************");
		firstRepeatedCharacter();
		System.out.println(" 29. * Write a Java 8 program to find the first non-repeated character in a string.\r\n");
		System.out.println("****************Start**********firstRepeatedCharacter***************************************");
		firstNonRepeatingCharacter();
		System.out.println(" 30   * Write a Java 8 program to generate the Fibonacci series");
		System.out.println("****************Start**********generateFibonacciSeries***************************************");
		generateFibonacciSeries();
		System.out.println(" 31. * Write a Java 8 program to print the first 10 odd numbers.");
		System.out.println("****************Start**********firstTenOddNumbers***************************************");
		firstTenOddNumbers();
		System.out.println(" 32.  * Write a Java 8 program to get the last element of an array.");
		System.out.println("****************Start**********lastElementInTheArray***************************************");
		lastElementInTheArray();
		System.out.println(" 33.  Write a Java 8 program to calculate the age of a person in years given their birthday.");
		System.out.println("****************Start**********calculatePersonAgeInYear***************************************");
		calculatePersonAgeInYear();
	}

	private static void ReverseStringUsingStream() {
		// TODO Auto-generated method stub
		String originalString = "Hello World"; // Step 1: Original string

		String reversedString = originalString
				// Step 1 & 2: Convert the string to a stream of characters and collect into a
				// list
				.chars().mapToObj(c -> (char) c).collect(Collectors.toList())
				// Step 3: Reverse the list
				.stream().sorted(Collections.reverseOrder())
				// Step 4 & 5: Convert the reversed list back into a stream, then collect into a
				// string
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream();
				})).map(String::valueOf).collect(Collectors.joining());

		// Step 6: Display the reversed string
		System.out.println("Original string: " + originalString);
		System.out.println("Reversed string: " + reversedString);
	}

	private static void calculatePersonAgeInYear() {
		LocalDate birthDate = LocalDate.of(1998, 8, 17);
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(birthDate, currentDate).getYears();
		System.out.println("Age of the person is: " + age);
	}

	private static void lastElementInTheArray() {
		int[] intArray = { 0, 1, 2, 3, 4, 5 };
		Integer lastElementInTheArray = Arrays.stream(intArray).boxed().reduce((first, second) -> second).orElse(-1);
		System.out.println("\nlast elements in the array " + lastElementInTheArray);
	}

	private static void firstTenOddNumbers() {
		Stream.iterate(1, i -> i + 2).limit(10).forEach(System.out::print);
	}

	private static void generateFibonacciSeries() {

		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[0])
				.forEach(System.out::print);

		Function<int[], List<Integer>> intArraytoListOFInt = array -> Arrays.stream(array).boxed()
				.collect(Collectors.toList());
		List<Integer> collect = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10)
				.map(intArraytoListOFInt).flatMap(List::stream).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void firstNonRepeatingCharacter() {
		String tempStr = "rohitrohi";
		System.out.println(Arrays.stream(tempStr.split(""))
				.filter(str -> tempStr.indexOf(str) == tempStr.lastIndexOf(str)).findFirst().orElse(""));

	}

	private static void checkIsTheStringPalindrome() {
		String str = "momd";
		String temp = str.replaceAll("\\s+", "").toLowerCase();
		System.out.println("is palindrome string " + IntStream.range(0, temp.length() / 2)
				.noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)));
	}

	private static void firstRepeatedCharacter() {
		String word = "rohttoh";
		System.out.println(Arrays.stream(word.split("")).filter(str -> word.indexOf(str) != word.lastIndexOf(str))
				.findFirst().orElse(""));
	}

	private static void duplicateCharactersInString() {
		String word = "rohttoh";
		System.out.println("original String " + word);

		System.out.println(Arrays.stream(word.split("")).filter(str -> word.indexOf(str) != word.lastIndexOf(str))
				.map(str -> str.charAt(0)).collect(Collectors.toList()));
	}

	private static void extractDuplicateElements() {
		List<Integer> duplicateElements = List.of(1, 2, 2, 2, 3, 3, 4, 5, 1, 1, 56, 7, 8, 9, 10);

		System.out.println("maxed Elements " + duplicateElements);

		List<Integer> extractDuplicateElements = duplicateElements.stream()
				.filter(element -> duplicateElements.indexOf(element) != duplicateElements.lastIndexOf(element))
				.distinct().collect(Collectors.toList());

		System.out.println("extract duplicates elements from " + extractDuplicateElements);
	}

	private static void stringsStartsWithNumber() {
		String[] words = { "rohit", "foo", "nemo", "target1", "12Target", "2robot" };

		System.out.println("original Strings " + Arrays.toString(words));

		List<String> stringStartNumber = Arrays.stream(words).filter(word -> Character.isDigit(word.charAt(0)))
				.toList();
		System.out.println("strings started with a number " + stringStartNumber);
	}

	private static void mostRepeatedElement() {
		int[] elements = { 2, 3, 1, 4, 4, 1, 4, 333, 3, 333, 2, 2, 2, 5, 222 };

		System.out.println("original Array" + Arrays.toString(elements));
		Function<Map<Integer, Long>, Integer> maxValuesKey = integerLongMap -> integerLongMap.entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(Integer.MAX_VALUE);

		Integer maxDuplicateValue = Arrays.stream(elements).boxed().collect(Collectors
				.collectingAndThen(Collectors.groupingBy(Function.identity(), Collectors.counting()), maxValuesKey));

		System.out.println("max duplicate value in the array " + maxDuplicateValue);
	}

	private static void reversedArray() {
		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("original array" + Arrays.toString(numberArray));
		int[] reversedArray = IntStream.rangeClosed(1, numberArray.length)
				.map(number -> numberArray[numberArray.length - number]).toArray();
		System.out.println("reversedArray Array" + Arrays.toString(reversedArray));
	}

	private static void reverseEachWord() {
		String stmt = "java is OOP language";
		String reverseEachWord = Arrays.stream(stmt.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reverseEachWord);
	}

	private static void commonElements() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> twoToTen = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> commonElements = oneToTen.stream().filter(twoToTen::contains).toList();
		System.out.println(commonElements);
	}

	private static void calculateAndSumAndAverage() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Double summaryStatistics = oneToTen.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(summaryStatistics.longValue());
		// System.out.println(summaryStatistics.a());
	}

	private static void sortByLengthOfList() {
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
	}

	private static void secondLargestNumberFromList() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer secondLarge = oneToTen.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(Integer.MAX_VALUE);

		System.out.println(secondLarge);
	}

	private static void sumOf() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(oneToTen.stream().mapToInt(Integer::intValue).sum());
	}

	private static boolean isAnagram2() {

		String string1 = "listen";
		String string2 = "silent";

		String join1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining(""));
		String join2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining(""));
		return join1.equals(join2);

	}

	private static void isAnagram() {
		char[] splitIt = "listen".toCharArray();
		char[] splitIt2 = "silent".toCharArray();

		Arrays.sort(splitIt);
		Arrays.sort(splitIt2);
		if (Arrays.equals(splitIt, splitIt2)) {
			System.out.println("is Anagram");
		} else {
			System.out.println("is not anagram");
		}

	}

	private static void min3max3() {
		List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
		List<Integer> min3 = randomNumbers.stream().sorted(Integer::compare).limit(3).collect(Collectors.toList());

		List<Integer> max3 = randomNumbers.stream().sorted((x, y) -> Integer.compare(y, x)).limit(3)
				.collect(Collectors.toList());
		System.out.println(min3);
		System.out.println(max3);
	}

	private static void mergeUnsortedArrayIntoSortedWithoutDuplicate() {
		int[] randomNumbers = { 12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43 };
		int[] randomNumber2 = { 4, 32, 2, 5, 6, 78, 98, 53, 90 };

		System.out.println(Arrays.toString(
				IntStream.concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2)).distinct().toArray()));
	}

	private static void mergeUnsortedArrayIntoSorted() {
		int[] randomNumbers = { 12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43 };
		int[] randomNumber2 = { 4, 3, 2, 5, 6, 78, 98, 53, 90 };

		int[] sortedArrayByMergingTwoArray = IntStream
				.concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2)).sorted().toArray();
		System.out.println(Arrays.toString(sortedArrayByMergingTwoArray));
	}

	private static void minMaxFromList() {
		List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
		Integer maxNumber = randomNumbers.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
		Integer minValue = randomNumbers.stream().min(Integer::compareTo).orElse(Integer.MIN_VALUE);
		System.out.println(maxNumber);
		System.out.println(minValue);
		IntSummaryStatistics summaryStatistics = randomNumbers.stream()
				.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getCount());
		System.out.println(summaryStatistics.getSum());
		System.out.println(summaryStatistics.getAverage());
	}

	private static void multipleOf5() {
		List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
		List<Integer> multipleOf5 = randomNumbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
		System.out.println(multipleOf5);
	}

	private static void joinListOfStrings() {
		List<String> languageList = List.of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
		String joinWithPrefixSuffixAndDelimiter = languageList.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(joinWithPrefixSuffixAndDelimiter);
	}

	private static void reverseSortedList() {
		List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
		// this is throwing unsupportedOprerationException because we are
		// tries to sort ImmutableList that is not allowed .
		// randomNumbers.sort(Comparator.reverseOrder());
		System.out.println(randomNumbers);
		List<Integer> sortInReverse = randomNumbers.stream().sorted((x, y) -> Integer.compare(y, x)) // reverse sort
				.collect(Collectors.toList());
		System.out.println(sortInReverse);

		List<Integer> sortListReverse = randomNumbers.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortListReverse);

	}

	private static void wordFrequency() {
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		Map<String, Long> frequencyWords = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequencyWords);
	}

	private static void characterFrequency() {
		String name = "rohitroh";
		Map<String, Long> characterFrequency = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(characterFrequency);

		Map<Character, Long> collected = name.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collected);

		Map<String, Integer> countCharacter = Arrays.stream(name.split("")).collect(Collectors
				.groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
		System.out.println(countCharacter);
	}

	private static void removeDuplicateFromList() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> removeDuplicate = oneToTen.stream().distinct().collect(Collectors.toList());

		System.out.println(removeDuplicate);

		Set<Integer> removeDuplicateWithoutOrder = oneToTen.stream().collect(Collectors.toSet());
		System.out.println(removeDuplicateWithoutOrder);

		List<Integer> uniqueElement = oneToTen.stream()
				.filter(number -> oneToTen.indexOf(number) == oneToTen.lastIndexOf(number))
				.collect(Collectors.toList());
		System.out.println(uniqueElement);
	}

	private static void separationOfEvenOddNumberInList() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Collection<List<Integer>> evenOddList = oneToTen.stream()
				.collect(Collectors.collectingAndThen(Collectors.partitioningBy(i -> i % 2 == 0), Map::values));

		System.out.println(evenOddList);
	}

	private static void separationOfEvenOddNumberInMap() {
		List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// output {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}

		Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println(evenAddOddSeparation);
	}

}
