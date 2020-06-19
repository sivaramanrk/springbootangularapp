package com.springboot.test;

public class Fibona {
	static int fibo(int n) {
		if(n<=1) 
			return n;
	//	System.out.println("nn "+n);
			return fibo(n-1)+fibo(n-2);
		}
	
	static void fibo2(int n)
	{
		int f=0,s=1,t;
		for(int i=0;i<n;i++) {
			System.out.println(s);
			
			t=f+s;
			f=s;
			s=t;
			
		}
	} 
	
	public static void main(String[] args) {
		int a=3;
		System.out.println(fibo(a));
		
		//fibo2(a);
	}

}
