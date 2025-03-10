package com.java8.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MovingAllZerosToTheLast {

	public static void main(String[] args) {
	//	pattern();
		findLoweststAndGreatest();
	}

	private static void findLoweststAndGreatest() {
		int[] id = {99, 88, 1, 77, 6, 5, 3, 7};
		Set<Integer> maxNum =new HashSet<>();
		Set<Integer> minNum = new HashSet<>();
		int max = id[0];
		int min = id[0];
		for(int i =0;i<id.length;i++) {
			if(max<id[i]) {
				max = id[i];
			}else if(min>id[i]) {
				min = id[i];
				
			}
			if(id[i]>=70) {
				maxNum.add(id[i]);
			}
			else {
				minNum.add(id[i]);
			}
		}
		System.out.println("max is " +max);
		System.out.println("min is "+min);
		System.out.println("maxnums in sorting are" +maxNum);
		System.out.println("minimums in sorting are  " +minNum);
		
	}

	private static void pattern() {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		for (int i = 0; i < id; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
