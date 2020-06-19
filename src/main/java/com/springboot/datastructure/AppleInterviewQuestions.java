package com.springboot.datastructure;

public class AppleInterviewQuestions {

	static public int[] productExceptSelf(int[] nums) {
		int N= nums.length;
		
		int[] left_products = new int[N];
		int[] right_products = new int[N];
		
		int[] output_arr = new int[N];
		
		left_products[0]=1;
		right_products[N-1]=1;
		
		for(int i=1; i<N;i++) {
			left_products[i] = nums[i-1] * left_products[i-1];
		}
		
		for(int i=1; i<N;i++) {
			right_products[i] = nums[i+1] * right_products[i+1];
		}
		
		for(int i=0; i<N;i++) {
			output_arr[i] = left_products[i] * output_arr[i];
		}
		
		return output_arr;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int[] result = productExceptSelf(arr);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
