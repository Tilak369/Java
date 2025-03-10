package com.java.basics.Oops;

public abstract class Vehicle {

      String fuelType() {
    	return "This is diesel";
    	
    }
      abstract void honk();
	public static void display() {
		System.out.println("This is a vehicle");
	}
}

