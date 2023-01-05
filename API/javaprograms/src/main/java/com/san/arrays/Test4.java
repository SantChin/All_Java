package com.san.arrays;

public class Test4 {

	public static void main(String[] args) {
		
		//String val2 ="IFERROR(__xludf.DUMMYFUNCTION("IMPORTRANGE(""https://docs.google.com/spreadsheets/d/1IV-XnE7GjRZr1nK1JcrWu6-gd7VWSlQWAzTfVThObHc/edit?usp=drivesdk"",""Sheet1!D5:D9"")"),"#REF!")"
		
		String val = "IFERROR(__xludf.DUMMYFUNCTION(\"IMPORTRANGE(\"\"https://docs.google.com/spreadsheets/d/1IV-XnE7GjRZr1nK1JcrWu6-gd7VWSlQWAzTfVThObHc/edit?usp=drivesdk\"\",\"\"Sheet1!D5:D9\"\")\"),\"#REF!\")";
		
		
		String r = "\"";
		
		//""
		
		String begining = val.substring(val.indexOf("IMPORTRANGE"));
		//String end = val.indexOf(")");
		
		String finalString  = val.substring(val.indexOf("IMPORTRANGE"), val.indexOf(")")+1).replaceAll("\"\"", "\"");
		
		String[] split = val.split("\"");
		
		String[] split1 = val.split(",");
	
	System.out.println(split);
	}
}
