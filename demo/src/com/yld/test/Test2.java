package com.yld.test;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

public class Test2 {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					//模拟在这里正好没有时间了，发生线程切换
					Thread.yield();
					System.out.println(
						getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					//模拟在这里正好没有时间了，发生线程切换
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
		
		
	}
}
class Table{
	private int beans = 20;
	/*
	 * 当一个方法被synchronized修饰以后，该方法
	 * 称为同步方法。多个线程不能同时进入方法内部
	 * 执行。
	 * 方法上声明synchronized后，上锁对象就是
	 * 当前方法所属对象(this)
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了!");
		}
		//模拟在这里正好没有时间了，发生线程切换
		Thread.yield();
		return beans--;
	}
}
