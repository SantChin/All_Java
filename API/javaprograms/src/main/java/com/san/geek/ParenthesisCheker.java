package com.san.geek;

import java.util.Stack;

public class ParenthesisCheker {

	public static void main(String[] args) {
		
		//String x = "{([])}";
		String x = "([]";
		boolean value = checkForParenthesis(x);
		System.out.println("Is Valid : "+value);
	}

	private static boolean checkForParenthesis(String x) {
		boolean flag = true;
		Stack<Character> stack = new Stack<>();
		char[] cArr = x.toCharArray();
		for(int i=0;i<cArr.length;i++) {
			
			char c = cArr[i];
			
			if(c=='{' || c=='('|| c=='[') {
				stack.push(c);
				continue;
			}
			
			int check = stack.pop();
			if(c == ']' && check =='[') {
				continue;
			}else if(c == ')' && check =='(') {
				continue;
			}else if(c == '}' && check =='{') {
				continue;
			}else {
				flag = false;
				break;
			}
			
			
		}
		
		if(flag && !stack.isEmpty()) {
			flag = false;
		}
		
		return flag;
	}
	
	
	 static boolean ispar(String x)
	    {
			Stack<Character> stack = new Stack<>();
			char[] cArr = x.toCharArray();
			for(int i=0;i<cArr.length;i++) {
				
				char c = cArr[i];
				
				if(c=='{' || c=='('|| c=='[') {
					stack.push(c);
					continue;
				}
				
				if(stack.isEmpty()){
					return false;
				}
				
				int check = stack.pop();
				if(c == ']' && check =='[') {
					continue;
				}else if(c == ')' && check =='(') {
					continue;
				}else if(c == '}' && check =='{') {
					continue;
				}else {
					return false;
				}
			}
			
			
			return stack.isEmpty();
	    }
	
}
