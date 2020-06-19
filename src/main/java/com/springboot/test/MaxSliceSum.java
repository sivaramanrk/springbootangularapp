package com.springboot.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSliceSum {

	static int maxslice(int A[]) {
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
			int sum = 0;
			for(int j=i+1;j<A.length;j++) {
				
				sum=sum+A[i]+A[j+1];
			}
			list.add(sum);
			//sum=0;

		}
		
		Collections.sort(list);
		System.out.println("list "+list);
		int n=0;
		if(!list.isEmpty()) {
			n=list.get(0);
		}
		return n;
	}
	public static void main(String[] args) {
		int A[]= {3,2,-6,4,0};
		System.out.println(maxslice(A));
	}
}
