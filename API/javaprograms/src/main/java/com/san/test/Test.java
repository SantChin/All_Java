package com.san.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
	/*	
		String x = "https://cf2020.atlassian.net/browse/EC-901";
		
		//String str =  "\"{41A74B51-4E78-4A52-A61F-FEBC765CEC19},2\"";
		
		String strv = "https://cloudfuzecom.sharepoint.com/:p:/r/sites/SantoshOne/_layouts/15/Doc.aspx?sourcedoc=%7BF5FB1202-0277-4DBD-9857-7BF30A830915%7D&file=Dell%20Inc.pptx&action=edit&mobileredirect=true ";
		
		String str = URLDecoder.decode(strv, "UTF-8");
		
		String regex = "\\{(.+?)\\}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

		if (matcher.find()) {
		    String contentBetweenCurlyBraces = matcher.group(1);
		    System.out.println(contentBetweenCurlyBraces);
		} else {
		    System.out.println("No match found.");
		}
		
		
		
		
		
		 String url = "https://www.example.com/path/to/file.html?param1=value1&param2=value2";
		    String encodedUrl = "";

		    try {
		      // Encode the URL, excluding the forward slash character (/)
		      encodedUrl = URLEncoder.encode(url, "UTF-8").replaceAll("\\+", "%20").replaceAll("%2F", "/").replaceAll("%3A", ":");
		    } catch (UnsupportedEncodingException e) {
		      e.printStackTrace();
		    }

		    System.out.println("Encoded URL: " + encodedUrl);
		
		
		*/
		
		String url = "https://democloudfuze.egnyte.com/app/index.do#storage/files/1/Private/erik/Santosh%20Links?p";
		 String privateString = null;
		//String privateString = url.substring(url.indexOf("Private"), url.indexOf("?"));
		
		int startIndex = url.indexOf("Private");
		if (startIndex != -1) {
		    int endIndex = url.indexOf("?", startIndex);
		    privateString = endIndex != -1 ? url.substring(startIndex, endIndex) : url.substring(startIndex);
		    // Do something with privateString
		} else {
		    // The URL does not contain the "Private" substring
		}
		String str = URLDecoder.decode(privateString, "UTF-8");
		System.out.println(str);
		
		
	}
}
