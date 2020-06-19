package com.springboot.datastructure;

public class MergeTwoArray {
	
	public static void main(String[] args) {
		int a[]= {1,5,6,9,12};
		int b[]= {2,3,7};
		int alength = a.length;
		int blength = b.length;
		int c[] = new int[alength+blength];
		int k=0,l=0;
		int y=1;
		
		for(int i=0;i<c.length;i++) {
			
			if(a[k]<b[l]) { 
				c[i]=a[k];
			
				k++;
			}else {
				if(y<=b.length) {
					c[i]=b[l];
					if(y==b.length) {
						y++;
						continue;
					
					}
					y++;
				}
					
				if(y>b.length) {
					c[i]=a[k];
					k++;
					
					continue;
				}
					
				if(l<b.length-1) {
					l++;
				}
				
			
				
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
}
