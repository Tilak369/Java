package com.java.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;

public class CommonClass {

	public static void main(String[] args) {
		// Immutability
		Immutability im = new Immutability("Tilak", 20);
		System.out.println("name " + im.getName());
		System.out.println("Id is " + im.getID());

		// AutoBoxing and Auto unboxing
		autoBoxingUnBoxing(im.getID(), 450000);

		// failfast and failsafe
		// failFastfailSafe();
		// forkjoinpool
		forkJoinPool();

	}

	private static void forkJoinPool() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		ForkJoinPool fl = new ForkJoinPool();
		ForkJoinPull task = new ForkJoinPull(arr, 0, arr.length);
		int result = fl.invoke(task);
		System.out.println("total result is    " + result);
	}

	private static void failFastfailSafe() {
		failFast();
		failSafe();

	}

	private static void failSafe() {
		CopyOnWriteArrayList<Integer> ii2 = new CopyOnWriteArrayList<>();
		ii2.add(1);
		ii2.add(2);
		ii2.add(3);

		Iterator<Integer> ii3 = ii2.iterator();
		while (ii3.hasNext()) {
			System.out.println("ii2 " + ii3.next());
			ii2.add(4);

		}
	}

	private static void failFast() {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		Iterator<Integer> ii = li.iterator();
		while (ii.hasNext()) {
			System.out.println("value is " + ii.next());
			li.add(4);
		}
	}

	private static void autoBoxingUnBoxing(int id, double salary) {
		Integer newId = id;
		Double db = salary;
		System.out.println("newId  " + newId + "  " + "Id " + db);

	}

}
