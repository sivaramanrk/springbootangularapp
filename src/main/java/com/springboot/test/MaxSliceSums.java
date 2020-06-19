package com.springboot.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bouncycastle.util.Arrays;

public class MaxSliceSums {
	static int max(int A[]) {
		int maxCount = 0;
		List<Integer>list = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<=A.length;j++) {
				int array[]=Arrays.copyOfRange(A, i, j);
				int sum =0;
				for(int k=0;k<array.length;k++) {
					sum=sum+array[k];
				}
				list.add(sum);
				
			}
		}
		Collections.sort(list);
		System.out.println(list);
		if(list.isEmpty()) {
			return maxCount;
		}
		return list.get(list.size()-1);
	}

	public static void main(String[] args) {
		int A[]= {3,5};
		System.out.println(max(A));
	}
}
