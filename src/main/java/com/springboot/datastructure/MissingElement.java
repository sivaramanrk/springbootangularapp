package com.springboot.datastructure;

import java.util.ArrayList;

public class MissingElement {

	public static void main(String[] args) {
		int a[] = {1,2,4};
		int b=a.length +1;
		
		ArrayList list = new ArrayList();
		
		for(int i=0;i<b;i++) {
			int j=1;
			list.add(j);
			j++;
		}
		
		for(int j=0;j<b;j++) {
			int q=a[j];
			int w=(int) list.get(j);
			if(q!=0) {
				
			}
		}
		
		
	}
}
