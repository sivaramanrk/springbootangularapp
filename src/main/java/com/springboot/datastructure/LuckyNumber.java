package com.springboot.datastructure;

 public class LuckyNumber {
	  static int count=2;
	 static  int np;
   static public int isLucky(int n) {
	  if(count>n) {
		  return 1;
	  }
	  
	  if(n%count==0) {
		return 0; 
	  }
	     np=n;
		 np=np-np/count;
		 count++;
	  return isLucky(np);
	  
  }
	
	public static void main(String[] args) {
		System.out.println(isLucky(7));
	}

}
