package com.springboot.test;

import java.util.ArrayList;
import java.util.TreeSet;

public class peakex {
	
	public static int getPeakcount(int a[]) {
		TreeSet<Integer>list = new TreeSet<>();
		int ar[];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]<a[j]&& a[j]>a[k]) {
						list.add(j);
					
					}
					break;
				}
			}
			
		}
		Integer[] numberArray = list.toArray( new Integer[list.size()] );
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				for(int k=j+1;k<list.size();k++) {
					Integer an=numberArray[i];
					Integer am=numberArray[j];
					Integer ao=numberArray[k];

					
					if(a[1]>1) {
						
					}
				}
			}
		}
		System.out.println(list);
		return 0;
	}

	public static void main(String[] args) {
		int a[]= {1,5,3,4,3,4,1,2,3,4,6,2};
		int ab= getPeakcount(a);
	}
}
