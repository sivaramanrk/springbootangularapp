package com.springboot.test;

import org.bouncycastle.util.Arrays;

public class peaks {
	
	static int countPeaks(int A[]) {
		for(int i=0;i<A.length;i++) {
			
			int n=A.length;
			for(int j=0;j<n;j++) {
				int a[]=Arrays.copyOfRange(A, j, n);
			}
			n=n/2;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		int A[]= {1,2,3,4,3,4,1,2,3,4,6,2};
		System.out.println(countPeaks(A));
	}

}
