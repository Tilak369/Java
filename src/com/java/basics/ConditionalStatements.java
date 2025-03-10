package com.java.basics;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		System.out.println("Enter gender");
		int age = sc.nextInt();
		System.out.println("Enter gender");
		String gender = sc.nextLine();
		determinePerson(age, gender);
		sc.close();

	}

	private static void determinePerson(int age, String gender) {
		if (age < 18) {
			if (gender.equals("female")) {
				System.out.println("you are a girl");
			}
			System.out.println("you are a boy");

		} else {
			if (gender.equals("female"))
				System.out.println("you are women");
			System.out.println("you are men");

		}
	}

}
