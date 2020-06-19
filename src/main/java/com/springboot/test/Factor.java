package com.springboot.test;

import java.util.HashMap;
import java.util.Map;

public class Factor {

	static int factorNum(int N) {
		int l=N;
		int count=0;
		for(int i=1;i<=l;i++) {
			if(N%i==0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(factorNum(24));
		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		map.put(1,2);
		map.put(3,2);
		for(Map.Entry ma:map.entrySet()) {
			System.out.println(ma.getKey() + "  "+ma.getValue());
			break;
		}
		System.out.println(map.size()/2);
		
	}
}
