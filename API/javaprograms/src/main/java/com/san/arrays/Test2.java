package com.san.arrays;

public class Test2 {

	public static void main(String[] args) {
		
//		String folder = "/scenario/CCD Estimated Course time/CCD Estimated?&&* Course time";
//		String[] folderPath = folder.split("/");
//		String objName = "CCD Estimated?&&* Course time";
//		String lastFolder = folderPath[folderPath.length - 1];
//		
//		System.out.println(folderPath.length);
//		
//		StringBuilder strb=new StringBuilder(folder);    
//		int index=strb.lastIndexOf(lastFolder);    
//		strb.replace(index,lastFolder.length()+index,"");
//		String val = strb.toString();
//		
//		System.out.println(val);
//		
		
		
		
		String folder = "/LongFileTest/Documents/TEST INNER";
		String[] folderPath = folder.split("/");
		if(folderPath.length > 3) {
			String lastFolder = folderPath[folderPath.length - 1];
			StringBuilder strb=new StringBuilder(folder);    
			int index=strb.lastIndexOf(lastFolder);    
			strb.replace(index,lastFolder.length()+index,"");
			String val = strb.toString();
			System.out.println(val);
		}
		
		System.out.println(folderPath.length);
		
	}
}
