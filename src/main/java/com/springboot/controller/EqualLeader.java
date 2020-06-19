package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

public class EqualLeader {
	

	static int equalLeader(int[] A) {
		
		int count=0;
		for(int i=0;i<A.length;i++) {
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
			for(int j=0;j<=i;j++) { 

				if(map.containsKey(A[j])) {
					map.put(A[j],map.get(A[j])+1);
				}else {
					map.put(A[j],1);
				}
			}
			
			
			for(int k=i+1;k<A.length;k++) {

				if(map2.containsKey(A[k])) {
					map2.put(A[k],map2.get(A[k])+1);
				}else {
					map2.put(A[k],1);
				}
			}
			
			for(int m=0;m<map2.size();m++) {
				System.out.println(map.size()+" size "+map2.size());
				for(int n=0;n<map.size();n++) {
					if(map.get(A[n])>map.size()/2 && map2.get(A[m])>map2.size()/2 && map.get(m)==map2.get(n)) {
					//	System.out.println(A[n] + A[m] + "");
						count=count+1;
					}
				}
			}
			
			
			
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		int a[] ={4,3,4,4,4,2};
		System.out.println(equalLeader(a));
	}
}
