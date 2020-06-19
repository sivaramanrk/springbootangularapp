package com.springboot.test;

public class Frag {

	static int frog(int X,int A[]) {
		
		int temp=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==X) {
				temp=i;
				break;
			}
		}
		if(temp==0) {
			return -1;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int A[]= {1,3,1,4,2,3,5,4};
		int X=5;
		System.out.println(frog(X,A));
		
	}
}
