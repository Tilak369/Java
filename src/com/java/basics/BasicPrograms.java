package com.java.basics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicPrograms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc2.nextLine();
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 2, 3, 9, 1, 3, 5, 6 };
		factorial(5);
		reverseString(st);
		palindrome(st);
		stringOccurence(st);
		reverseAnArray(arr);
		matchingElements(arr, arr2);
		swapTwoNumber(5, 10);
		fibonacci(5);
		sumOfNaturalNumber(5);
		replaceString();
		patternProg();	}
	
	private static void patternProg() {
		StringBuilder sb = new StringBuilder();
		String st ="2a3b4c5d";
		Pattern pt = Pattern.compile("(\\d+)([a-zA-Z])");
		Matcher mt = pt.matcher(st);
		while(mt.find()) {
			int i = Integer.parseInt(mt.group(1));
			char c = mt.group(2).charAt(0);
			sb.append(String.valueOf(c).repeat(i));
		}
		
		System.out.println(sb);
	}

	private static void replaceString() {
		String st ="BANKOFAMERICA";
		char ch ='A'; 
		StringBuilder sb =new StringBuilder();
		for(int i =0; i<st.length();i++) {
			if(ch == st.charAt(i)) {
				sb.append("U");
				
			}
			else {
				sb.append(st.charAt(i));
			}
			
			
		}
		System.out.print(sb);
		
	}

	private static void sumOfNaturalNumber(int j) {
		int sum=0;
		for(int i =1;i<=j;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

	private static void fibonacci(int n) {
		for (int i = 0; i <= n; i++) {
			if (n >= 1)
				System.out.println(n);
			else {
				System.out.println((n - 1) + (n - 2));
			}
		}

	}

	private static void swapTwoNumber(int i, int j) {
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("Values after swapping a= " + i + ", b= " + j);

	}

	private static void matchingElements(int[] arr, int[] arr2) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i : arr) {
			hs.add(i);

		}
		for (int j : arr2) {
			if (hs.contains(j)) {
				System.out.print(j + "");
			}
		}

	}

	private static void reverseAnArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "");
		}

	}

	private static void stringOccurence(String st) {
		char c = '1';
		int count = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);

	}

	private static void palindrome(String st) {
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		boolean isPali = st.equalsIgnoreCase(rev);
		System.out.println(isPali);

	}

	private static void reverseString(String st) {
		char[] ch = st.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + "");
		}

	}

	private static void factorial(int s) {
		int temp = 1;
		for (int i = 1; i <= s; i++) {
			temp = temp * i;
		}

		System.out.println("Factorial is " + temp);
	}
}
