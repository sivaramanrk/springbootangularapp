package com.springboot.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Equileader {

	static int counts(int A[]) {
		
		int count=0;
		

		for(int i=0;i<A.length;i++) {
			Map<Integer,Integer>map = new HashMap<>();
			Map<Integer,Integer>map2 = new HashMap<>();
			
			for(int i2=0;i2<=i;i2++) {
				if(map.containsKey(A[i2])) {
					map.put(A[i2],map.get(A[i2])+1);
				}else {
					map.put(A[i2],1);
				}
			}
			
			
			
			for(int j=i+1;j<A.length;j++) {
				
				if(map2.containsKey(A[j])) {
					map2.put(A[j],map2.get(A[j])+1);
				}else {
					map2.put(A[j],1);
				}
			}
			int max1=0;
			int maxkey=0;
			
			/*
			 * for(Map.Entry m:map.entrySet()) { max1=(int) m.getValue(); maxkey =(int)
			 * m.getKey(); break; }
			 */
			int max2=0;
			int maxkey2 =0;
			
			/*
			 * for(Map.Entry m:map.entrySet()) { max2=(int) m.getValue(); maxkey2 =(int)
			 * m.getKey(); break; }
			 */
			
			for(Map.Entry m:map.entrySet()) {
				int mv=(int) m.getValue();
				/*
				 * if(max1==0) { max1=(int) m.getValue(); maxkey=(int) m.getKey(); }
				 */
				if(mv>max1) {
					max1=(int) m.getValue();
					maxkey=(int) m.getKey();
				}
			}
			
			
			for(Map.Entry m2:map2.entrySet()) {
				int mv2=(int) m2.getValue();
				/*
				 * if(max2==0) { max2=(int) m2.getValue(); maxkey2=(int) m2.getKey(); }
				 */
				if(mv2>max2) {
					max2=(int) m2.getValue();
					maxkey2=(int) m2.getKey();
				}
			}
			float s1=(float)map.size()/2;
			float s2=(float)map2.size()/2;

			if(max1>s1) {
				if( max2>s2 ) {
					if( maxkey2 == maxkey)
				count++;
				}
			}
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		int A[]= {4,3,4,4,4,2};
		int B[]= {4, 4, 2, 5, 3, 4, 4, 4};
		System.out.println(counts(A));
		System.out.println(counts(B));

	}
}
