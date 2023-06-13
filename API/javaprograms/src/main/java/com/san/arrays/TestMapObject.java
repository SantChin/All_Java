package com.san.arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapObject {

	public static void main(String[] args) {
		
		
		
		
		
		String target = "Hello";
		
		Set<String> valuesSet =  new HashSet<String>();
		valuesSet.add("Hello");
		if(org.apache.commons.lang3.StringUtils.isNotEmpty(target) && valuesSet.contains(target)) {
			System.out.println(target);
		}
		
		
		Map<String,Map<String,String>> finalMap = new HashMap<String,Map<String,String>>();
		
		Map<String,String> data = new HashMap<String,String>();
		
		data.put("key1", "value1");
		data.put("key2", "value2");
		data.put("key3", "value3");
		data.put("key4", "value3");
		
		Map<String,String> data2 = new HashMap<String,String>();
		data.put("key7", "value4");
		data.put("key8", "value5");
		data.put("key9", "value3");
		data.put("key10", null);
		
		
		finalMap.put("123", data);
		finalMap.put("456", data2);
		
		
		
		
		Set<String> collect = getValuesSet(finalMap);
		//map.values().stream().collect(Collectors.toList());
		
		System.out.println(collect);
	}

	private static Set<String> getValuesSet(Map<String, Map<String, String>> finalMap) {
		Set<String> valuesSet = new HashSet<String>();
		if(finalMap!=null && finalMap.size() > 0) {
			for(Map<String,String> map : finalMap.values()) {
				Set<String> tempSet = map.values().stream().filter(x->x!=null).collect(Collectors.toSet());
				valuesSet.addAll(tempSet);
			}
		}
		return valuesSet;
	}
}
