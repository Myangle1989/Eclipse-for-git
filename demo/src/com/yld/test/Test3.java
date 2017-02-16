package com.yld.test;

import com.yld.entity.ChirldrenDemo;
import com.yld.entity.TestDemo;

public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		@SuppressWarnings("rawtypes")
		Class cls = Class.forName("com.yld.entity.TestDemo");
		System.out.println("动态生成类："+cls.getName());
		Object obj = cls.newInstance();
		System.out.println("动态生成具体类："+obj.getClass());
		if(obj instanceof com.yld.entity.TestDemo){
			TestDemo td = (TestDemo)obj;
			td.setName("张三");
			td.setAge("20");
			System.out.println("动态设置属性:"+td);
		}
		
		String str = "aa";
		switch(str){
			case "aa":
				System.out.println("switch 可以作用在str类型上");
		}
		ChirldrenDemo td = new ChirldrenDemo();
		td.setName("张三");
		td.setAge("20");
		td.setJob("Boss");
		ChirldrenDemo cd = Test(td);
		System.out.println(cd.getJob());
	}
	public static <V extends TestDemo & TestInterface> V Test(V v){
		
		System.out.println(v.getName()+" "+v.getAge());
		
		return v;
	}
}
