package com.springboot.datastructure;

public class Rearrangearray {
	
	static void array() {
		
		int arr[]= {1,2,3,4,5};
		int j=arr.length-1;
		int me=arr[arr.length-1]+1;
		int min=0 ;
		for(int i=0;i<arr.length;i++) {
			
			
			
			if(i%2==0) {
				
				arr[i]=(arr[i]+((arr[j]%me)*me));
				j--;
			}else { 
				
				arr[i]=(arr[i]+((arr[min]%me)*me));
				min=min+1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]/6);
		}
		
	}
	public static void main(String[] args) {
		array();
	}

}
