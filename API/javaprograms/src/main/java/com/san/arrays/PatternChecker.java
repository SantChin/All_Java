package com.san.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternChecker {

	
	public static void main(String[] args) {
		
		
		String srcLinkId = null;
		String sourceUrl = "https://docs.google.com/document/d/1t-T-Jy0CPE-dz10VvXhOSToblL2DcLaQPVkjjVZ4zVE/edit";
		
		String sl[] = sourceUrl.split("/");
		
		if(srcLinkId == null){
			for(String str : sl){
				if(str.isEmpty() || str.length()<=8){
					continue;
				}
				Pattern p = Pattern.compile("");
				Matcher m = p.matcher(str);
				if(m.matches() || m.find()){
					//LOG.warn(getClass().getCanonicalName()+"==Fetched Link==="+fileId+"===workSpace==="+workSapceId);
				}else{
					continue;
				}
			}
		}
	}
}
