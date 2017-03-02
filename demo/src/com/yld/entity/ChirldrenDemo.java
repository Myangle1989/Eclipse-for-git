package com.yld.entity;

import java.util.ArrayList;
import java.util.List;

import com.yld.test.TestInterface;

public class ChirldrenDemo extends TestDemo implements TestInterface,Cloneable{
	private String job;
	private Student std;
	private String[] jobs;
	private List<String> address;
	private List<Student> stdList;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}
	
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String[] getJobs() {
		return jobs;
	}

	public void setJobs(String[] jobs) {
		this.jobs = jobs;
	}
	
	public List<Student> getStdList() {
		return stdList;
	}

	public void setStdList(List<Student> stdList) {
		this.stdList = stdList;
	}

	@Override
	protected Object clone() {
		ChirldrenDemo cd = null;
		try {
			cd = (ChirldrenDemo)super.clone();
			
			cd.std = (Student)(std.clone());
			
			cd.jobs = (String[])jobs.clone();//深度克隆
			
			cd.stdList = new ArrayList<Student>();
			for(int i=0;i<stdList.size();i++){
				Student cloneStd = (Student)stdList.get(i).clone();
				cd.stdList.add(cloneStd);
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cd;
	}
	@Override
	public void methodA() {
		System.out.println("实现接口TestInterface中抽象方法！");
	}
}
