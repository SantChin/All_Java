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
	return null;
}
}
