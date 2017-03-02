package com.yld.entity;

public class Student implements Cloneable{
	private String name;
	private String age;
	
	public Student() {
		super();
	}
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	protected Object clone(){
		Student std = null;
		try {
			std = (Student)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return std;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
