package com.springboot.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonnaci2 {
	static int fib(int n) {
		List<Integer>list=new ArrayList<>();
		int a=0,b=1,c = 0;
		if(n==0)
			return n;
		list.add(0);
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			list.add(b);
			
		}
		System.out.println(list);
		return b;
	}
	
	public static void main(String[] args) {
		int n=100;
		System.out.println(fib(n));
	}

}
