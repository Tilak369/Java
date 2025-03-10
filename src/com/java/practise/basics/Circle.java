package com.java.practise.basics;

public class Circle extends Shape {

	void draw() {
		System.out.println("this is circle");

	}
	public static void main(String[] args) {
		Shape ci = new Circle();
		ci.draw();
	}

}
