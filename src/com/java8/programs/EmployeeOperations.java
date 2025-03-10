package com.java8.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import util.Employee;

public class EmployeeOperations {
	public static void main(String[] args) {
		List<Employee> em = new ArrayList<>();
		em.add( new Employee(1,899899,"Vizag","Wipro","aa"));
		em.add( new Employee(2,899989,"Hyd","Wipro","aba"));
		em.add( new Employee(3,988989,"Hyd","Wipro","abx"));
		em.add( new Employee(4,888899,"Hyd","Wipro","bcs"));
		em.add( new Employee(5,889899,"Hyd","Wipro","gas"));
		filterBySalary(em);
		filterByLocation(em);
		filterById(em);
	}
	

	private static void filterById(List<Employee> em) {
		List<Integer> i = new ArrayList<>();
		for(Employee e : em) {
			int id = e.getId();
			i.add(id);
		}
		System.out.println("Ids are" +i);
		System.out.println("Filltering based on Id");
		List<Integer> filterid =em.stream().filter(E -> "gas".equalsIgnoreCase(E.getName())).map(emp -> emp.getId()).collect(Collectors.toList());
		List<Integer> newID = em.stream().filter(R-> "Tilak".equals(R.getName())).map(emp -> emp.getId()).collect(Collectors.toList());
		System.out.println("filter id is " +filterid);
		System.out.println("new Id is " +newID);
	}

	private static void filterByLocation(List<Employee> em) {
		List<Map.Entry<String, String>> per = new ArrayList<>();
		for (Employee sal : em) {
			String loc = sal.getLocation();
			String name = sal.getName();
			per.add(Map.entry(loc, name));

		}
		System.out.println("Location of the employees" + per);

	}

	private static void filterBySalary(List<Employee> em) {
		List<Double> d = new ArrayList<>();
		for (Employee e : em) {
			double sal = e.getSalary();
			d.add(sal);
		}
		System.out.println("salary " + d);
		List<String> filteredEmployee = em.stream().filter(E -> "Hyd".equalsIgnoreCase(E.getLocation())).map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println("name of the person having same location is" + filteredEmployee);
	}

	private static void usingJava8(List<Integer> sal) {
		Optional<Integer> newUpdatedSalary = sal.stream().collect(Collectors.reducing(Integer::max));
		newUpdatedSalary.ifPresent(System.out::println);
	}

	private static void usingJava7(List<Integer> sal) {
		Integer max = sal.get(0);// Assume max value is 1st value
		for (int i = 1; i < sal.size(); i++) {
			if (sal.get(i) > max) {
				max = sal.get(i);
			}
		}
		System.out.println("max value is " + max);
	}

}
