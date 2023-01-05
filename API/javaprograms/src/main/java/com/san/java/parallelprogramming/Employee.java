package com.san.java.parallelprogramming;

public class Employee {

	private int id;
	private String firstName;
	private String grade;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String firstName, String grade, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.grade = grade;
		this.salary = salary;
	}

	

}
