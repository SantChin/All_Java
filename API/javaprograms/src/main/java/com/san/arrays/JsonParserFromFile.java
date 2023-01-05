package com.san.arrays;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParserFromFile {

	
	public static void main(String[] args) {
		
		
		 JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("C:\\Santosh WorkSpace\\Other Files\\NOTEPAD FILES\\pathlinks.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	        
	         JSONArray jsonArry  = (JSONArray) jsonObject.get("result");
	         
	     	for(int i =0;i<=jsonArry.size()-1;i++) {
			//	System.out.println(i);
				JSONObject tmep = new JSONObject();
				tmep =  (JSONObject) jsonArry.get(i);
				
				if(Integer.parseInt(tmep.get("total").toString()) > 1)
				System.out.println("\""+tmep.get("_id")+"\""+",");
				//System.out.println(tmep.get("_id"));
			}
//	         
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
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}
}
