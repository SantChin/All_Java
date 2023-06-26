package com.san.arrays;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComapreTwoListOfStringsFromFile {

	
	public static void main(String[] args) throws IOException {
		
	
		List<String> partDataList;
		try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Santosh\\Desktop\\HQ\\New folder\\PART DATA.txt"))) {
			partDataList = lines.collect(Collectors.toList());
		}
		
		List<String> allDataList;
		try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Santosh\\Desktop\\HQ\\New folder\\ALL DATA.txt"))) {
			allDataList = lines.collect(Collectors.toList());
		}
		
//		allData.removeAll(new HashSet(hyperLinkQExists));
//		
//		
//		FileWriter writer = new FileWriter("C:\\Users\\Santosh\\Desktop\\HQ\\New folder\\output.txt"); 
//		for(String str: allData) {
//		  writer.write(str + System.lineSeparator());
//		}
//		writer.close();
//		
//		//System.out.println(allData);
//		
//		System.out.println("DONE");
		
		List<String> deletedList = new ArrayList<String>();
		List<String> notDeletedList = new ArrayList<String>();
		
		
		for(String part : partDataList) {
			if(allDataList.contains(part)) {
				notDeletedList.add(part);
			}else {
				deletedList.add(part);
			}
		}
		
		
		System.out.println("Not Deleted List : "+notDeletedList);
		
		System.out.println("Deleted List : "+deletedList);
	}
}
