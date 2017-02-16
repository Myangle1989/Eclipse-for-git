package com.yld.entity;

import com.yld.test.TestInterface;

public class ChirldrenDemo extends TestDemo implements TestInterface{
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public void methodA() {
		System.out.println("实现接口TestInterface中抽象方法！");
	}
}
