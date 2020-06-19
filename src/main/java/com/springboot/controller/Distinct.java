package com.springboot.controller;

public class Distinct {
	
	static int distinct(int A[]) {
		
		int var=0;
		int var2 =0 ;
		
		
		for(int i=0;i<A.length;i++) {
			int count=0;
			for(int j=1;j<i;j++) {  
				if(A[i] == A[j]) {  
					//A[j]=0;
				//	System.out.println(A[j]+" A[j]");
					count+=count+1;
				}
			}
			if(count<=1) {
				//System.out.println(var+" var");
				var =A[i];
			}
		}
	
		
		return var;
	}

	public static void main(String[] args) {
		int A[]= {2,1,1,2,4,1};
		System.out.println(distinct(A));
	}
}
