package com.san.arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParser_V1 {
public static void main(String[] args) {
		
		String jsonString = getJsonStringV3();
		
		JSONObject jsonObj = new JSONObject(jsonString);
		
		JSONArray jsonArry  = (JSONArray) jsonObj.get("result");
		
		for(int i =0;i<=jsonArry.length()-1;i++) {
			System.out.println(i);
			JSONObject tmep = new JSONObject();
			tmep =  (JSONObject) jsonArry.get(i);
			System.out.print("\""+tmep.get("_id")+"\""+",");
			//System.out.println(tmep.get("_id"));
		}
	}

private static String getJsonStringV3() {
	// TODO Auto-generated method stub
	return "{\r\n" + 
			"    \"result\" : [ \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet11.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet4.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet9.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet12.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet15.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet13.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet20.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet6.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet18.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet2.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet7.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet8.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet17.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet14.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet1.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet16.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet3.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet19.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet10.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }, \r\n" + 
			"        {\r\n" + 
			"            \"_id\" : \"sheet5.xml\",\r\n" + 
			"            \"count\" : 10\r\n" + 
			"        }\r\n" + 
			"    ],\r\n" + 
			"    \"ok\" : 1\r\n" + 
			"}";
}
}
