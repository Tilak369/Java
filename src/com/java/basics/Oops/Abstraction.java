package com.java.basics.Oops;

public class Abstraction {

	public static void main(String[] args) {
		circle();
		rectangle();
		Shape circle = new Circle();
		circle.draw();
	}

	private static void circle() {
		Circle ci = new Circle();
		ci.draw();
	}

	private static void rectangle() {
		Rectangle rc = new Rectangle();
		rc.draw();
	}

}
