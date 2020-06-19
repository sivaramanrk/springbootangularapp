package com.springboot.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle {
	static int rectangleCount(int N) {
		
		List<Integer> list = new ArrayList<>();
		int l = N;
		for(int i=1;i<=l;i++) {
			for(int j=1;j<=l;j++) {
				System.out.println("i "+i * j+" ");
				if(i*j==l) {
					list.add(2*(i+j));
				}
				
			}
		}
		Collections.sort(list);
		System.out.println(list+" list");
		int n=0;
		if(!list.isEmpty()) {
			n=list.get(0);
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println(rectangleCount(36));
	}
}
