package com.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class WordCounter {
	
	public static void main(String[] args) {
		String familyMembers = "G Lavanya G Tilak G Srinu G PAPARAO G ANNAPOORNA";
		usingNonJava8(familyMembers);
		usingJava8(familyMembers);
		nonRepeating(familyMembers);
		wordCountAndDuplicates(familyMembers);
	}

	private static void nonRepeating(String familyMembers) {
		
		
	}

	private static void usingJava8(String famMem) {
		Map<String,Long> sorted = Arrays.stream(famMem.split(" ")).collect(Collectors.groupingBy(word->word,Collectors.counting()));
		for(Map.Entry<String, Long> sp : sorted.entrySet()) {
			System.out.println(sp.getKey() + "-->" +sp.getValue());
			
		}
		
	}

	private static void usingNonJava8(String familyMembers) {
		
		ConcurrentHashMap<String,Integer> st = new ConcurrentHashMap<>();
		for(String famMembers:familyMembers.split(" ") ) {
			st.put(famMembers, st.getOrDefault(famMembers, 0)+1);
		}
		System.out.println("No of words " +st);
	}
   private static void wordCountAndDuplicates(String st) {
	  // String st = " my name is good boy";
	  String[] newSt = st.split(" ");
	   Map<String,Integer> wordCount = new HashMap<>();
	   for(String words: newSt) {
		   wordCount.put(words,wordCount.getOrDefault(wordCount, 0)+1);
		   
	   }
	   System.out.println(wordCount);
	   
	   List<String> wordDuplicates = new ArrayList<>();
	   for(Map.Entry<String,Integer> dupe: wordCount.entrySet()) {
		   
		   if(dupe.getValue()>1) {
			   wordDuplicates.add(dupe.getKey());
		   }
		   
	   }
	   System.out.println(wordDuplicates);
	   
   }
}
