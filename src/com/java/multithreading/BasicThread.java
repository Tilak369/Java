package com.java.multithreading;

public class BasicThread {

	public static void main(String[] args) {
		Thread th = new Thread();
		th.start();
		System.err.println("My new Thread" + th.currentThread());
	}

}
