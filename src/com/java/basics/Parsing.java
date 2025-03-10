package com.java.basics;

public class Parsing {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 10; i++) {
			boolean prime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % 2 == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i + " ");
				count++;
			}
		}

	}

}
