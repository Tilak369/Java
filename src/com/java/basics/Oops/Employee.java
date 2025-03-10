package com.java.basics.Oops;

public class Employee extends Person {
	double salary;

	Employee(int age, String name, double salary) {
		super(age, name);
		this.salary = salary;
	}


	public static void main(String[] args) {
		Employee em = new Employee(25,"Tilak",100000);
		System.out.println(em.name + " " + em.age +"" + em.salary);
		

	}

}
