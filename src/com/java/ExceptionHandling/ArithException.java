package com.java.ExceptionHandling;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		try {
			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			throw e;

		} finally {
			sc.close();
		}
	}

}
