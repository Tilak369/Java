package com.java.ExceptionHandling;

import java.util.Scanner;

public class CommonClass {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		try {
			checkInput(a);

		} catch (InvalidInputException e) {
			System.out.println("Invalid Input " + e.getMessage());

		} finally {
			sc.close();
		}
	}

	private static void checkInput(int a) throws InvalidInputException {
		if (a > 0) {
			System.out.println("Proper Input");
		}
		throw new InvalidInputException("Invalid Input passed");

	}

}
