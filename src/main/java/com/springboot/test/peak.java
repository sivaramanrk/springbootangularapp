package com.springboot.test;

import java.util.ArrayList;

public class peak {

	static int flag(int A[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<A.length;i++) {
			 	for(int j=i+1;j<A.length;j++) {
			 		for(int k=j+1;k<A.length;k++) {
			 			if(A[i]<A[j] && A[j]>A[k]) {
			 				list.add(j);
			 				break;
			 			}
			 			break;
			 		}
			 		break;
			 	}
			 			 
		}
		
		
		int flag=0;
		int count =0;
		int s = list.size();
		while(s>0) {
			flag=1;
			int fla=flag;
			for(int i=0;i<list.size();i++) {
				for(int j=i+1;j<list.size();j++) {
					int diff=Math.abs(list.get(0)-list.get(j));
					if(diff>=flag) {
						count++;
						flag--;
						
						break;
					}
					if(flag==0) {
						
						break;
					}
					
				}
				if(fla<=list.size()) {
				flag =fla+1;
				
				}
				
			}
			s--;
		}
		
		
		
		
		
		System.out.println(list);
		return count;
	}
	
	public static void main(String[] args) {
		int A[]= {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		//int A[]= {1, 5, 3};
		System.out.println(flag(A));
	}
}
