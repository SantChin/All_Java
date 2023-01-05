package com.san.arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class CheckForCorruptedFiles {

	
	
	public static void main(String[] args) throws IOException {
		
		 File f = new File("C:\\Users\\Santosh\\Desktop\\File Corrupted\\" + "Fuze FY20 Actuals.docx");
         InputStream inputStream = new FileInputStream(f);
        XWPFDocument doc = new XWPFDocument(inputStream);
       
        
       // List<IBodyElement> bodyElements = doc.getBodyElements();
        
       // System.out.println(bodyElements.size());
        
        
	}
	
	
	
	
//	public static Boolean IsCorrupt(String path)
//	{
//	    try
//	    {
//	    
//	    	
//	    	XWPFDocument document = new XWPFDocument(is);
//	 
//		
//	    }
//	    catch(Exception ex)
//	    {
//	        return true;
//	    }
//	    return false;
//	}
}
