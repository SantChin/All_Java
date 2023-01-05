package com.san.arrays;

import java.net.URLEncoder;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

public class Test5 {

	public static void main(String[] args) {
		
		
		String val = "{\"fileName\":\"Screenshot (8).png\",\"boxSharedLink\":\"https://app.box.com/s/9ovdzdkml2pj4gp88kequbvhk7nvtxuu\",\"boxFileId\":\"1008711989897\"}";
		
		//{"boxSharedLink":"https://app.box.com/s/sikzfv0xzrgd4letjwg23bcensmelutl","boxFileId":"947757648843","fileName":"MicrosoftTeams-image (9).png"}
		
		JSONObject jsonObj = new JSONObject();
		try {
			jsonObj.put("boxSharedLink", "https://app.box.com/s/xsq47dz36w14ifx3luutdvkbsasu8f9h");
			jsonObj.put("boxFileId", "123");
			jsonObj.put("fileName", "test.png");
		}catch(Exception e) {
			
		}
		
		System.out.println(new String(Base64.encodeBase64(val.getBytes())));
		
		String listFormat = "number_"+"A908K";
		String lists = listFormat.substring(0,listFormat.length()-1).trim();
	
		System.out.println(lists);
		//System.out.println(URLEncoder.encode(jsonObj.toString()));
		
		int indexOfDash = listFormat.indexOf('_');
		String before = listFormat.substring(0, listFormat.indexOf('_'));
		String after =listFormat.substring(indexOfDash + 1);
		
		System.out.println(before);
	}
}
