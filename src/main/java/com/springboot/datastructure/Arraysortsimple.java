package com.springboot.datastructure;

public class Arraysortsimple {

	public static void main(String[] args) {
		int a[] = {4,1,5,2,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int temp;
				if(a[i]<a[j]) {
					 a[i] = a[j];
					 temp = a[j];
					 a[j] =temp;
					
			         
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
