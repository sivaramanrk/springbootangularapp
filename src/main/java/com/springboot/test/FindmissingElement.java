package com.springboot.test;

import java.util.Vector;

public class FindmissingElement {
	public static void main(String[] args) {
		Vector vec =new Vector();
		vec.add(3);
		vec.add(3);
		vec.add(3);
		vec.add(5);
		vec.add(1);
		
		Vector mis =new Vector();
		for(int i=0;i<vec.size();i++) {

			int temp=(int)vec.get(i)-1;
			if((int)vec.get(temp)>0) {
				vec.set(temp,-(int)vec.get(temp));
			}else {
				vec.set(temp,vec.get(temp));
			}
		}
		for(int i=0;i<vec.size();i++) {
			if((int)vec.get(i)>0) {
				mis.add(i+1);
			}
			//System.out.println("mis... "+mis);
		}
	}

}
