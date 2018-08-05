package com.model;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String dept;
	private double percentage;
	
	public Student(int id, String name, int age, String dept, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.percentage = percentage;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return String.format("%d,%s,%d,%s,%.2f", id,name,age,dept,percentage);
	}

}
