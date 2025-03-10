package com.java.basics;

public class variables {
	static int count;
	public static void main(String[] args) {
		int a =5;
		int b= a++;
		System.out.println(a+""+b);
		String s= "abc";
		count++;
		String j = "java";
		method(j);
		System.out.println(j);
		String s1 = new String("abc");
		System.out.println(s==s1);
		System.out.println(false&true);
		
		

	}
	private static void method(String j) {
		j = "python";		
	}

}
