package com.san.interviewprgms;

import java.util.ArrayList;

public class SubarraySum {

	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       
        boolean outer = false;
        ArrayList<Integer> list= new ArrayList<Integer>();
       for(int i=0;i<arr.length;i++){
    	  int result = 0;
         list.add(i+1);
          for(int j=i;j<arr.length;j++){
             result = result+arr[j];
             if(result == s){
                 list.add(j+1);
                 outer = true;
                 break;
             }
         }//Inner
         if(outer){
             break;
         }else{
             list.clear();
         }
       }
       
       System.out.println(list);
       
       if(list.size() !=0){
           return list;
       }else{
           list.add(-1);
           return list;
       }
       
       
    }
	
	
	//Version 2 //Optimal Solution
	 static ArrayList<Integer> subarraySumV2(int[] arr, int n, int s) 
	    {
	        // Your code here
	        int left = 0;
	        int right = 0;
	        int sum = arr[0];
	        
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        
	        while(right<n){
	            if(sum==s){
	                ans.add(left+1);
	                ans.add(right+1);
	                return ans;
	            }
	            else if(sum<s || left==right){
	                if(right==n-1) break;
	                right++;
	                sum+=arr[right];
	                
	            }
	            else{
	                sum-=arr[left];
	                left++;
	            }
	        }
	        
	        ans.add(-1);
	        return ans;
	        
	    }
	
	
	
	public static void main(String[] args) {
		
		subarraySumV2(new int[]{1,2,3,7,5}, 5, 12);
	}
}
