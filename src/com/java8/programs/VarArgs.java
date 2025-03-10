package com.java8.programs;

public class VarArgs {
	
	public static void main(String[] args) {
		printnames("Tilak","Rahul","Pavan","Lucky","Arju");
	}

	private static void printnames(String... names) {
		for(String name : names) {
			System.out.println("Names are  "  +name);
		}
		
		
	}

}
