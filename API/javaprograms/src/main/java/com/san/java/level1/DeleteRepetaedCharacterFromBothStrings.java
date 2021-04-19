package com.san.java.level1;

public class DeleteRepetaedCharacterFromBothStrings {

	
	public static void main(String[] args) {
		
		
		 String s1 = "aBc";
         String s2 = "bcde";
         System.out.println("s1 = " + s1 + " , s2 = " + s2);
         
         char[] ch1 = s1.toCharArray();
         char[] ch2 = s2.toCharArray();
         
         for(int i=0;i<ch1.length ;i++) {
        	 boolean match = false;
        	 for(int j=0;j<ch2.length ;j++) {
        		 
        		 if(String.valueOf(ch1[i]).toLowerCase().equals( String.valueOf(ch2[j]).toLowerCase())) {
        			 match = true;
        			 break;
        		 }
        		
        	 }
        		 if(match) {
        			 s1 = s1.replaceAll(String.valueOf(ch1[i]).toLowerCase(), "");
        			 s1 = s1.replaceAll(String.valueOf(ch1[i]).toUpperCase(), "");
        			 s2 = s2.replaceAll(String.valueOf(ch1[i]).toLowerCase(), "");
        			 s2 = s2.replaceAll(String.valueOf(ch1[i]).toUpperCase(), "");
        		 }
        		 
        	
        	
         }
         
         
         
         
         
         System.out.println("Modified s1 = " + s1 + ",  Modified s2 = " + s2);

	}
}
