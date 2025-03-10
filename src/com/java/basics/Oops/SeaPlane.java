package com.java.basics.Oops;

public class SeaPlane implements Divable, Flyable {

	@Override
	public void fly() {
		System.out.println("we are flying");

	}

	@Override
	public void dive() {
		System.out.println("we are diving");

	}

}
