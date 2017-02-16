package com.yld.entity;

public class TestDemo implements Comparable<Object>{
	private String name;
	private String age;
	
	public TestDemo() {
		super();
	}
	public TestDemo(String name, String age) {
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
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(obj instanceof TestDemo){
			TestDemo td = (TestDemo)obj;
			return td.name == this.name && td.age == this.age;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "TestDemo [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(o == null) return -1;
		if(o == this) return 0;
		if(o instanceof TestDemo){
			TestDemo td = (TestDemo)o;
			return td.name.length()- this.name.length();
		}
		return 0;
	}
}
