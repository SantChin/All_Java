package com.san.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test17 {

	public static void main(String[] args) {
		
		//(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|\"\\)(?!\")!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]
		
		//String url = "HYPERLINK(\"https://democloudfuze.egnyte.com/app/index.do#storage/files/1/Shared/ISSUE%20TEST/SHARED%20TO%20ALEX/J%20!%40%23%24%5B%5D!%5E%26)(_())(-\")";
		
		
		
		//String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]*\"\\)[^\\)]*$";
		//String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]*\"\\)[^\"]*$";
		//String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]*[\"\\)[^\"]]*$";
		
		//String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|\"\\)[^\")]]*";
	//	String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|\\\"\\\\)(?!\\\")!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";


		
		//String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]*\"\\)[^\")]*$";
		//String pattern2 = "HYPERLINK\\(\"(.*?)\"\\)";
//		  String pattern3 = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]\\)[^\\)]*$";
//		
//		
//		  String pattern1 = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]\\)[^\\)]*$";
//		Pattern r = Pattern.compile(pattern);
//		String urlName =  null;
//		Matcher m = r.matcher(url);
//		while (m.find()) {
//			urlName = m.group();
//		}
//		System.out.println(urlName);
		
		
		
		String url = "IF(B2=\"ALEX\",HYPERLINK(\"https://democloudfuze.egnyte.com/app/index.do#storage/files/1/Shared/ISSUE%20TEST/A%20!%40%23%24%5B%5D!%5E%26)(_-\"),IF(B2=\"BARRY\",HYPERLINK(\"https://democloudfuze.egnyte.com/app/index.do#storage/files/1/Shared/ISSUE%20TEST/B%20!%40%23%24%5B%5D!%5E%26)(_-\")))";
		
		String url1 = "IF(B2=\"ALEX\",HYPERLINK(\"https://democloudfuze.egnyte.com/app/index.do#storage/files/1/Shared/ISSUE%20TEST/A%20!%40%23%24%5B%5D!%5E%26)(_-\"))";
		
		
		
		String[] arrList = url1.split(",IF");
		
		System.out.println(arrList);
		
		
		String url_ = "/ISSUEE/NESTED FOLDER /1 FOLDER/2 FOLDER/3 FOLDER/4 FOLDER/5 FOLDER/6 FOLDER/7 FOLDER/8 FOLDER/9 FOLDER/10 FOLDER/11 FOLDER/12 FOLDER/13 FOLDER/14 FOLDER/15 FOLDER/16 FOLDER/INNER SYNORBT CAN VIEW.docx";
		
		String newUrl = checkForLinkPathRectify(url_, 0);
		System.out.println(newUrl);
		
		
		
		
		
	}
	
	private static String checkForLinkPathRectify(String linkPath, int opt) {
		String newPath = null;
		try {
			if(linkPath!=null && opt == 0) {
				String folders[] = linkPath.split("/");
				for(int i=0;i<folders.length;i++) {
					folders[i] =folders[i].trim(); 
				}
				newPath = String.join("/", folders);
			}
		} catch (Exception e) {
			newPath = linkPath;
		}
		return newPath;
	}
}
