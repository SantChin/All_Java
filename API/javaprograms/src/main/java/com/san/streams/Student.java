package com.san.streams;

public class Student {

	private String id;
	private String name;
	private boolean active;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", active=" + active + "]";
	}

}
