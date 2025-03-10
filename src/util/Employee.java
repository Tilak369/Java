package util;

public class Employee {

	int Id;
	double salary;
	String location;
	String company;
	String name;

	public Employee(int id, double salary, String location, String company, String name) {
		this.Id = id;
		this.salary = salary;
		this.location = location;
		this.company = company;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
