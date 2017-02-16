package com.yld.test;

import java.awt.Label;

public class Test4 {
	public static void main(String[] args) {
		//a = 011 b= 100
		int a = 3,b = 4;
		a = a^b;//a = 111
		System.out.println("临时变量二进制值:"+Integer.toBinaryString(a));
		b = a^b;//b = 011
		System.out.println("临时变量二进制值:"+Integer.toBinaryString(b));
		a = a^b;//b = 100
		System.out.println("临时变量二进制值:"+Integer.toBinaryString(a));
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		//c=1010 d= 1100
		int c = 10,d = 12;
		c = c^d;//0110
		d = c^d;//1010
		c = c^d;//1100
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int e = c & d;//1000
		System.out.println("e="+e);
		
		int f = c | d;//1110
		System.out.println("f="+f);
		
		short i = 1;
		i = (short)(i + 1);
		i += 1;
		//2=0010 16 = 0001 0000
		System.out.println(Math.round(-11.5));
		int j = 2 << 3;
		System.out.println("j="+j);
		
		One:for(int k=0;k<10;k++){
			for(int h=0;h<10;h++){
				if(k ==5 && h==6){
					System.out.println("跳出多层循环！k="+k+" h="+h);
					break One;
				}
			}
			System.out.println("跳出多层循环！k="+k);
		}
		
	}
}
