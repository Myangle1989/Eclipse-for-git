package com.yld.test;

import java.util.ArrayList;
import java.util.List;

public class Base64Decoder {
	public static void main(String[] args) {
		String str = "<div class=\"banner banner-2\" id=\"banner_2\">        <div class=\"header-2\">            <div class=\"container1\">                <div class=\"header_content\">                    ";
		System.out.println(str.length());
		str = str.replaceAll("\n","");
		System.out.println(str.length());
		System.out.println(str.replaceAll("[\\s]{2,}",""));
		
		List<String> list = new ArrayList<>();
		list.add("张三");
		System.out.println(list.size()+"----"+list.get(0));
		
		for(int i=0;i<4;i++){
			System.out.println(i%2);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("张三");
		sb.append("李四");
		System.out.println("sbStr:"+sb.toString()+"length:"+sb.length());
//		sb.setLength(0);
		sb.delete(0,sb.length());
		System.out.println("sbStr:"+sb.toString());
	}
}
