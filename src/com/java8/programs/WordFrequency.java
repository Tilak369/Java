package com.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		wordFrequency();
		arrayList();
		linkedList();
		hashedSet();
		linkedHashSet();
		hashMap();

	}

	private static void hashMap() {
		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1, "Tilak");
		hashmap.put(2,"abass");
		hashmap.put(3,"asassa");
		hashmap.put(2, "lannd");
		System.out.println("new values are " +hashmap.get(3));
		System.out.println("new values are " +hashmap.remove(2));
		System.out.println("new values are " +hashmap);
		if(hashmap.containsKey(3)) {
			System.out.println("hash value is "  +hashmap.get(2));
		}
		System.out.println("size if hash map is " +hashmap.entrySet());
		
	}

	private static void linkedHashSet() {
		LinkedHashSet<String> list = new LinkedHashSet<>();
		list.add("APPLE");
		list.add("Banana");
		list.add("Apple");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		System.out.println("LinkedHash Set List is " +list);
		
	}

	private static void hashedSet() {
		HashSet<String> list = new HashSet<>();	
		list.add("APPLE");
		list.add("Banana");
		list.add("Apple");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		System.out.println("Set List is " +list);
	}

	private static void linkedList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("APPLE");
		list.add("Banana");
		list.add("Apple");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		System.out.println("List is " +list);
		/*
		 * Iterator<String> ii = list.iterator(); while(ii.hasNext()) {
		 * System.out.println("Iteraot is  " +ii.hasNext()); ii.remove(); }
		 */
		
	}

	private static void arrayList() {
		List<String> list = new ArrayList<>(3);
		list.add("APPLE");
		list.add("Banana");
		list.add("Apple");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		list.add("BANANA");
		
		System.out.println("List is " +list);
		
	}

	private static void wordFrequency() {
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		Map<String, Long> frequencyWords = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//List<String> sb = names.stream().filter(E-> E.valueOf())
		System.out.println(frequencyWords);
	}
}
