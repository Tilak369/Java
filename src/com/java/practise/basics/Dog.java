package com.java.practise.basics;

public class Dog extends Mammal {

	
	void whoAmI(){
		System.out.println("Im a Dog");
	}
	
	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.whoAmI();
	}
}
