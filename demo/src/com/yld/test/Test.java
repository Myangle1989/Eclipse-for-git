package com.yld.test;


import com.yld.entity.TestDemo;

public class Test {
	public static void main(String[] args) {
		TestDemo td1 = new TestDemo("张飒","20");
		TestDemo td2 = new TestDemo("张飒","20");
		System.out.println(td1.equals(td2));
		System.out.println(td1.compareTo(td2));
		System.out.println("td1的hashcode:"+td1.hashCode()+"\ntd2的hashcode："+td2.hashCode());
		System.out.println(td2.equals(td1));
		
		Thread t = Thread.currentThread();
		System.out.println(t.getId()+"\n"+t.getName());
		
		final Thread down = new Thread(){
			public void run(){
				System.out.println("线程："+Thread.currentThread()+"开始下载...");
				for(int i=0;i<=100;i++){
					System.out.println("下载进度："+i+"%");
				}
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				try {
					down.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程："+Thread.currentThread()+"开始显示...");
				for(int i=0;i<=100;i++){
					System.out.println("显示进度："+i+"%");
				}
			}
		};
		down.start();
		show.start();
		
	}
}
