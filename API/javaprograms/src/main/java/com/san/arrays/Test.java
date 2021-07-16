package com.san.arrays;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.san.streams.Employee;

public class Test {

	public static void main(String[] args) {
		
		
		List<Employee> employeeList = Arrays.asList(
				new Employee("1", "Ajay", 35, 35000,"HR", true),
				new Employee("2", "Ajay", 45, 36000,"HR", false), 
				new Employee("3", "Ajay", 50, 50000,"IT", false),
				new Employee("4", "Vijay", 54, 60000, "IT",true), 
				new Employee("5", "Vijay", 60, 70000,"ADMIN", true),
				new Employee("6", "Vijay", 70,80000,"ADMIN", true));
		
		
		Map<String,List<Employee>> newMap = new HashMap<String,List<Employee>>();
		newMap.put(null,employeeList );
		
		Long val = new Long("269683");
		System.out.println(formatFileSize(val));
		
//		for(Employee emp : employeeList) {
//			if(newMap.containsKey(emp.getFirstName())) {
//				newMap.get(emp.getFirstName()).add(emp);
//			}else {
//				List<Employee> empList = new ArrayList<Employee>();
//				empList.add(emp);
//				newMap.put(emp.getFirstName(), empList);
//			}
//		}
		
		//System.out.println(newMap.toString());
//		
//		String msg = "Hello World";
//		int statusCode =403;
//		
//		try {
//		if(msg!=null && msg.contains("Hello") && statusCode ==403) {
//			System.out.println("S");
//		}else {
//			System.out.println("N");
//		}
//		}catch(Exception e) {
//			System.out.println(e);
//		}
	}
	
	
	
	
    private static String formatFileSize(long size) {
    	String fileSize = null;

    	double b = size;
    	double k = size/1024.0;
    	double m = ((size/1024.0)/1024.0);
    	double g = (((size/1024.0)/1024.0)/1024.0);
    	double t = ((((size/1024.0)/1024.0)/1024.0)/1024.0);
    	DecimalFormat dec = new DecimalFormat("0.00");
    	if ( t>1 ) {
    		fileSize = dec.format(t).concat(" TB");
    	} else if ( g>1 ) {
    		fileSize = dec.format(g).concat(" GB");
    	} else if ( m>1 ) {
    		fileSize = dec.format(m).concat(" MB");
    	} else if ( k>1 ) {
    		fileSize = dec.format(k).concat(" KB");
    	} else {
    		fileSize = dec.format(b).concat(" Bytes");
    	}
    	return fileSize;
    }
    
    
    
    
    
}
