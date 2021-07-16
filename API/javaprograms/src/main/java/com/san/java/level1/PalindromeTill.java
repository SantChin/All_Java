package com.san.java.level1;

public class PalindromeTill {

	public static void main(String[] args) {
		
		
		int cnt =0;
		for(int i=10;i<1000;i++) {
			
			char[] ch = String.valueOf(i).toCharArray();
			boolean isPalindorme =true;
			for(int j=0;j<ch.length/2;j++) {
				if(ch[j]!=ch[ch.length-1-j]) {
					isPalindorme =false;
					break;
				}
			}
			
			if(isPalindorme) {
				cnt++;
				System.out.println(i);
				}
		}
		
	System.out.println(cnt);
	}
	
	 public boolean isPalindrome(int x) {
		    
	       if(x < 0 || (x % 10 == 0 && x != 0)) {
	            return false;
	        }
	        
	        boolean flag = false;
	        int val = 0;
	        int temp = x;
	        while(temp > 0){
	            int rem = temp%10;
	            temp=temp/10;
	            val = val*10+rem;
	        }
	        
	        if(x == val){
	            flag = true;
	        }
	        return flag;
	    }
}
