package com.springboot.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSortedBasedOnValues {
	
	static HashMap<String,Integer> sortByValue(HashMap<String,Integer> map){
		
		List<Map.Entry<String,Integer>>list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String,Integer> >(){
			public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		HashMap<String, Integer>temp = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String,Integer> mp:list) {
			temp.put(mp.getKey(), mp.getValue());
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		  // enter data into hashmap 
        hm.put("Math", 98); 
        hm.put("Data Structure", 85); 
        hm.put("Database", 91); 
        hm.put("Java", 95); 
        hm.put("Operating System", 79); 
        hm.put("Networking", 79); 
        HashMap<String,Integer> mp = sortByValue(hm);
        
        for(Map.Entry<String,Integer> m:mp.entrySet()) {
        	System.out.println(m.getKey() + "  "+m.getValue());
        }
        
	}

}
