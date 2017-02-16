package com.yld.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class StringToHtml {
	public static void main(String[] args) {
		String str = "<html>"
					+ "<head>"
					+ "	<script src=\"../assert/js/11.js\"></script>"
					+ "	<script src=\"assert/js/22.js\"></script>"
					+ "	<link rel=\"stylesheet\" href=\"../../stylesheets/story.css\"/>"
					+ "</head>"
					+ "<body>"
					+ "<p>hahahaha</p>"
					+"<img class=\"header-logo-img\" src=\"../../images/header/hw-logo.png\">"
					+"<a href=\"#export\"/>"
					+ "	<script src=\"../../assert/js/33.js\"></script>"
					+ "</body>"
					+ "</html>";
		Document doc = Jsoup.parse(str);
		System.out.println(doc);
		Elements scripts = doc.getElementsByAttribute("src");
		for(Element script:scripts){
			String srcValue = script.attr("src");
			System.out.println("原始属性："+srcValue);
			//将所有路径拆分
			String[] pathElements = srcValue.split("\\/");
			String newSrc = "";
			for(String pathElement:pathElements){
				System.out.println("待处理路径组成元素"+pathElement);
				if(!pathElement.equals(".")&&!pathElement.equals("..")){
					System.out.println("需要处理路径组成元素"+pathElement);
					newSrc += pathElement+"/";
				}
			}
			System.out.println("处理前新属性："+newSrc);
			newSrc = newSrc.substring(0,newSrc.length()-1);
			System.out.println("处理后新属性："+newSrc);
			//将新值替换原来属性
			script.attr("src",newSrc);
			System.out.println("处理后"+script.nodeName()+":"+script);
		}
		Elements hrefEles = doc.getElementsByAttribute("href");
		for(Element hrefEle:hrefEles){
			System.out.println(hrefEle.nodeName()+"处理前："+hrefEle);
			String href = hrefEle.attr("href");
			String newHref = "";
			if(href.contains("/")){
				System.out.println("待处理href："+href);
				String[] hrefChilds = href.split("\\/");
				for(String hrefChild:hrefChilds){
					if(!hrefChild.equals(".")&&!hrefChild.equals("..")){
						newHref += hrefChild+"/";
					}
				}
				newHref = newHref.substring(0,newHref.length()-1);
			}else{
				newHref = href ;
			}
			
			hrefEle.attr("href",newHref);
			System.out.println(hrefEle.nodeName()+"处理后："+hrefEle);
		}
		System.out.println("处理后doc:"+doc);
	}
}
