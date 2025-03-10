package com.java.basics.Oops;

public class CAR extends Vehicle implements Drivable {

	public static void main(String[] args) {
		Vehicle.display();
		

	}

	@Override
	void honk() {
		System.out.println("Please sound Horn");

	}

	@Override
	public void drive() {
		System.out.println("Please Drive");

	}

}
