package com.san.xmlsplitting;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SplitXML_V2 {
    public static void main(String[] args) throws IOException {
        int chunkSize = 20 * 1024 * 1024; // 20MB
        int chunkCounter = 1;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Santosh\\Desktop\\Large XML\\sheet11_temp.xml"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            if (sb.length() > chunkSize) {
                writeToFile("small_file_" + chunkCounter + ".xml", sb.toString());
                chunkCounter++;
                sb.setLength(0);
            }
        }
        writeToFile("small_file_" + chunkCounter + ".xml", sb.toString());
        br.close();
        
        System.out.println("Done");
    }

    private static void writeToFile(String fileName, String content) throws IOException {
    	
    	File file = new File("C:\\Users\\Santosh\\Desktop\\Large XML\\SMALL_PARTS\\"+fileName);
        file.setWritable(true);
        file.setReadable(true);
    	
    	FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
    }
}
