package com.capgemini.Microservice.MicroService.model;

public class EmployeePojo {
	private String id;
	private String designation;
	private int Salary;
	private String name;
	public EmployeePojo(String id, String designation, int salary, String name) {
		super();
		this.id = id;
		this.designation = designation;
		Salary = salary;
		this.name = name;
	}
	public EmployeePojo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeePojo [id=" + id + ", designation=" + designation
				+ ", Salary=" + Salary + ", name=" + name + "]";
	}
	

}
