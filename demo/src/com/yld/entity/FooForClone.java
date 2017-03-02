package com.yld.entity;

import java.util.ArrayList;
import java.util.List;

public class FooForClone {
	
	private ChirldrenDemo chirld;
	
	public void changeChirldrenDemoName(String name){
		chirld.setName(name);
	}
	public ChirldrenDemo getChirld() {
		return chirld;
	}

	public void setChirld(ChirldrenDemo chirld) {
		this.chirld = chirld;
	}
	
	public static void main(String[] args) {
		FooForClone foo = new FooForClone();
		ChirldrenDemo cd = new ChirldrenDemo();
		Student std = new Student("老王","30");
		List<String> addr = new ArrayList<>();
		addr.add("北京");
		addr.add("上海");
		
		String[] jobs = new String[]{"Boss","Employee"};
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student("111","111"));
		stdList.add(new Student("222","222"));
		
		cd.setName("张三");
		cd.setStd(std);
		cd.setAddress(addr);
		cd.setJobs(jobs);
		cd.setStdList(stdList);
		
		System.out.println("**** 改变前，cd.name:"+cd.getName()+"\nstd:"+std+"\n"+addr
							+"\n"+stdList);
		for(String job:jobs){
			System.out.println("**** 改变前，jobs:"+job);
		}
		
		foo.setChirld((ChirldrenDemo)cd.clone());
		foo.changeChirldrenDemoName("李四");
		Student std2 = foo.getChirld().getStd();
		List<String> addr2 = foo.getChirld().getAddress();
		String[] jobs2 = foo.getChirld().getJobs();
		for(int i=0;i<jobs2.length;i++){
			jobs2[i] = i+"";
		}
		List<Student> stdList2 = foo.getChirld().getStdList();
		
		stdList2.add(new Student("333","333"));
		stdList2.add(new Student("444","444"));
		addr2.add("广州");
		addr2.add("深圳");
		
		std2.setName("王五");
		std2.setAge("40");
		foo.getChirld().setStd(std2);
		foo.getChirld().setAddress(addr2);
		foo.getChirld().setJobs(jobs2);
		foo.getChirld().setStdList(stdList2);
		
		System.out.println("--------------------------");
		System.out.println("**** 改变后，cd.name:"+cd.getName()+
							"\nstd:"+std+"\n"+addr+"\n"+stdList);
		for(String job:jobs){
			System.out.println("**** 改变后，jobs:"+job);
		}
		
	}
}
