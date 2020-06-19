package com.springboot.controller;

public class FrogJmp {

	static int frogJump(int X,int Y,int D) {
		
		int count = 0;
		while(X<Y) {
			count++;
			X+=D;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(frogJump(10,85,30));
	}

}
