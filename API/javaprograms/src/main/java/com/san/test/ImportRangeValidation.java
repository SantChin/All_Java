package com.san.test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImportRangeValidation {

	
	public static void main(String[] args) {
		
		 String formula = "IFERROR(__xludf.DUMMYFUNCTION(\"IMPORTRANGE(\"\"https://docs.google.com/spreadsheets/d/1ikCVV7tPL62lgiMUI2gXSVp2YNorJPQBNkNd05dDWM8/edit#gid=0\"\",\"\"Sheet1!B5\"\")\"),\"#REF!\")";
		 Map<String, String> formulaLinkMap = new HashMap<String,String>();
		 
		 
		 
		 // Regex pattern to match the IMPORTRANGE function and capture its arguments
//	        Pattern pattern = Pattern.compile("IMPORTRANGE\\(\"(.*?)\",\"(.*?)\"\\)");
//	        Matcher matcher = pattern.matcher(formula);

	        // Extract the values inside the IMPORTRANGE function
//	        if (matcher.find()) {
//	            String url = matcher.group(1);
//	            String range = matcher.group(2);
//	            
//	            System.out.println("URL: " + url);
//	            System.out.println("Range: " + range);
//	        }
	        
	        
	     // Regex pattern to match the complete IMPORTRANGE function
	        Pattern pattern = Pattern.compile("(IMPORTRANGE\\(\".*?\".*?\".*?\"\\))");
	        Matcher matcher = pattern.matcher(formula);

	        // Extract the complete IMPORTRANGE function
	        if (matcher.find()) {
	            String importRangeFunction = matcher.group(1);
	            importRangeFunction = importRangeFunction.replaceAll("\"\"", "\"");

	            System.out.println("IMPORTRANGE function: " + importRangeFunction);
	        }
		 
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        String formula1 = "IFERROR(__xludf.DUMMYFUNCTION(\"IMPORTRANGE(\"\"https://docs.google.com/spreadsheets/d/1ikCVV7tPL62lgiMUI2gXSVp2YNorJPQBNkNd05dDWM8/edit#gid=0\"\",\"\"Sheet1!B5\"\")\"),\"how are you doing!!!!\")";

	        // Replace the last quoted string with "#REF!"
	        String modifiedFormula = formula1.replaceFirst("\"[^\"]+\"\\)$", "\"#REF!\")");

	        System.out.println("Modified formula: " + modifiedFormula);
	}
}
