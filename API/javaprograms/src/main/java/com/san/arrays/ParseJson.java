package com.san.arrays;

import org.json.JSONObject;

public class ParseJson {

	public static void main(String[] args) {
		
		
		String json = getJsonString();
		
		JSONObject jsonString = new JSONObject(json);
		int k =1;
		for(int i=0;i<=20;i++) {
			JSONObject object = (JSONObject) jsonString.get(i+"");
			String name = (String) object.get("name");
			name = name.replaceAll("_", "_1_");
			System.out.println(k+". "+name+"_1");
			//System.out.println(k+". "+name);
			System.out.println(object.get("key"));
			System.out.println();
			k++;
		}
		
		
	}

	
	private static String getJsonString() {
		return "{\r\n" + 
				"    \"0\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"_id_\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"_id\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.UserDriveChanges\"\r\n" + 
				"    },\r\n" + 
				"    \"1\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"moveWorkSpaceId_sourceParent_deleted_updated\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"moveWorkSpaceId\" : 1,\r\n" + 
				"            \"sourceParent\" : 1,\r\n" + 
				"            \"deleted\" : 1,\r\n" + 
				"            \"updated\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.UserDriveChanges\",\r\n" + 
				"        \"background\" : true\r\n" + 
				"    },\r\n" + 
				"    \"2\" : {\r\n" + 
				"        \"v\" : 1,\r\n" + 
				"        \"name\" : \"createdTime\",\r\n" + 
				"        \"key\" : {\r\n" + 
				"            \"createdTime\" : 1\r\n" + 
				"        },\r\n" + 
				"        \"ns\" : \"cloudfuze.UserDriveChanges\",\r\n" + 
				"        \"background\" : true\r\n" + 
				"    }\r\n" + 
				"}";
		}
	}
