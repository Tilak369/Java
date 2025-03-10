package com.java.practise.basics;

public class Employee extends Person {

	long salary;

	public Employee(String name, int age, long salary) {
		super(name, age);
		this.salary = salary;

	}

	public static void main(String[] args) {
		Employee em = new Employee("Tilak", 26, 100000);
		System.out.println(em.name +" " +em.age +" " +em.salary +" ");
	}

}
