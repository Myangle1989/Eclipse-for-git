package com.yld.test;

public class Test5 {
	public static void main(String[] args) {
		A a = new B(5);
		a.methodA();
		B b = new B(6);
		System.out.println(b.getClass());
		
		
	}
}
abstract class A {
	private int a = 1;
	
	public A() {
		super();
	}

	public A(int a) {
		super();
		this.a = a;
		System.out.println("A类构造方法，参数为："+a);
	}
	public void methodA(){
		System.out.println("调用A类方法，参数="+a);
	}
}
class B extends A {
	private int b = 2;
	
	public B() {
		super();
	}

	public B(int b) {
//		super(b);
		this.b = b;
		System.out.println("B类构造器...");
	}
	public void methodB(){
		super.methodA();
		System.out.println("调用B类方法，参数="+b);
	}
	
	public void methodA() {
		System.out.println("B类重写A类methodA方法，参数="+b);;
	}
}