package com.java.basics;

import java.util.concurrent.RecursiveTask;

public class ForkJoinPull extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int[] arr;
	private final int start, end;
	private static final int thresshold = 10;

	public ForkJoinPull(int[] arr, int start, int end) {
		this.arr = arr;
		this.end = end;
		this.start = start;

	}

	@Override
	protected Integer compute() {
		if (end - start <= thresshold) {
			int sum = 0;
			for (int i = start; i < end; i++) {
				sum = sum += arr[i];
				System.out.println("sum " + sum);
				return sum;
			}
			
		}
		int mid = (start + end) / 2;
		ForkJoinPull left = new ForkJoinPull(arr, start, mid);
		ForkJoinPull right = new ForkJoinPull(arr, mid, end);
		left.fork();
		int rightResult = right.compute();
		int leftResult = left.join();
		int totalResult = leftResult + rightResult;
		System.out.println("Result " + totalResult);
		return totalResult;

	}

}
