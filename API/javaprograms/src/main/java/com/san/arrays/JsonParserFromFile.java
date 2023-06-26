package com.san.arrays;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParserFromFile {

	
	public static void main(String[] args) {
		
		
		 JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("C:\\Users\\Santosh\\Desktop\\Sample Data\\test.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	        
	         JSONArray jsonArry  = (JSONArray) jsonObject.get("value");
	         
	         
	         
	     	for(int i =0;i<=jsonArry.size()-1;i++) {
			//	System.out.println(i);
				JSONObject tmep = new JSONObject();
				tmep =  (JSONObject) jsonArry.get(i);
				
				//if(Integer.parseInt(tmep.get("total").toString()) > 1)
				System.out.println("\""+tmep.get("id")+"\""+",");
				//System.out.println(tmep.get("_id"));
			}

	         
	         
//	         String name = (String)jsonObject.get("Name");
//	         String course = (String)jsonObject.get("Course");
//	         JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
//	         System.out.println("Name: " + name);
//	         System.out.println("Course: " + course);
//	         System.out.println("Subjects:");
//	         Iterator iterator = subjects.iterator();
//	         while (iterator.hasNext()) {
//	            System.out.println(iterator.next());
//	         }
	     	
	     	
	     	
	     	
	     	
	     	
//	     	//UseCase 2
//	     	int count = 0;
//	     	int totalCount = 0;
//	     	
//	     	List<String> list = new ArrayList<String>();
//	     	Map<String,Integer> dataMap = new HashMap<>();
//	     	
//	     	for(int i =0;i<=jsonArry.size()-1;i++) {
//				//	System.out.println(i);
//					JSONObject tmep = new JSONObject();
//					tmep =  (JSONObject) jsonArry.get(i);
//					
//					int _count = Integer.parseInt(tmep.get("count").toString());
//					if( _count < 1000) {
//						System.out.println(tmep.get("_id") + "--->"+_count);
//					}
//					totalCount =totalCount+_count;
//					
//					
//					//if(Integer.parseInt(tmep.get("total").toString()) > 1)
//					//System.out.println("\""+tmep.get("_id")+"\""+",");
//					//System.out.println(tmep.get("_id"));
//				}
//	     	
//	     	System.out.println(totalCount);
	     	
	     	
	     	
	     	//UseCase 3 Printing Using map in desecding order
//	     	int count = 0;
//	     	int totalCount = 0;
//	     	
//	     	List<String> list = new ArrayList<String>();
//	     	Map<String,Integer> dataMap = new HashMap<>();
//	     	
//	     	for(int i =0;i<=jsonArry.size()-1;i++) {
//				//	System.out.println(i);
//					JSONObject tmep = new JSONObject();
//					tmep =  (JSONObject) jsonArry.get(i);
//					dataMap.put(tmep.get("_id").toString(), Integer.parseInt(tmep.get("count").toString()));
//			}
	     	
	     	//System.out.println(totalCount);
//	     	
//	     	Map<String, Integer> sorted = dataMap 
//	     			.entrySet() 
//	     			.stream() 
//	     			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
//	     			.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
//
//	     	
//	     	  for (HashMap.Entry<String, Integer> val : sorted.entrySet()) { 
//
//	     		System.out.println(val.getKey() +","+val.getValue());
//	     		
//	     		   }  
	     	
	     	
	     	
	     	
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}
	
	
	
	
}
