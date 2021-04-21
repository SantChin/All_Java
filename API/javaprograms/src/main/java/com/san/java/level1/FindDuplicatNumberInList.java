package com.san.java.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatNumberInList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> templist = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		list.add(5);
		list.add(10);
		int cnt =1;
		
		for(Integer val : list) {
			if(templist.contains(val)) 
				System.out.println("Duplicate Element " + val);
			else
				templist.add(val);
		}
		
		/*
		 * Map<Integer,Integer> tempMap = new HashMap<>(); for(Integer val : list) {
		 * if(tempMap.containsKey(val)) { tempMap.put(val, tempMap.get(val)+1); }else {
		 * tempMap.put(val, cnt); } }
		 */
		
		
		
	}
}
