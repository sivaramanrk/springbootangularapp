package com.springboot.controller;

public class PermMissingElem {
	
	static int missingElem(int arr[]) {

	    if(arr.length == 0) return 1;

	    int sumArr = 0;


	    for(int i=0; i < arr.length; i++){

	        sumArr = sumArr + arr[i];

	    }


	    int sumN = 0;

	     for(int i=1; i <= arr.length+1; i++){

	        sumN = sumN + i;

	    }


	    if(sumArr == sumN)  return arr.length;


	    return  sumN - sumArr;
		
	}
	
	public static void main(String[] args) {
		
		int A[] = {2,3,1,5};
		
		System.out.println(missingElem(A));
		
	}

}
