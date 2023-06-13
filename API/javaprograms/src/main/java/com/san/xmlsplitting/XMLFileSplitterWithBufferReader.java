package com.san.xmlsplitting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class XMLFileSplitterWithBufferReader {
    private static final int MAX_FILE_SIZE = 20 * 1024 * 1024; // 20 MB

    public static void main(String[] args) throws IOException {
        File inputFile = new File("large_file.xml");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line = null;
        int fileCount = 1;
        BufferedWriter writer = null;
        int currentFileSize = 0;

        while ((line = reader.readLine()) != null) {
            if (line.contains("<record>")) {
                if (writer != null && currentFileSize >= MAX_FILE_SIZE) {
                    writer.close();
                    currentFileSize = 0;
                }
                if (writer == null || currentFileSize >= MAX_FILE_SIZE) {
                    writer = new BufferedWriter(new FileWriter("small_file_" + fileCount + ".xml"));
                    fileCount++;
                }
            }
            writer.write(line);
            writer.newLine();
            currentFileSize += line.getBytes().length + 2; // add 2 for the line break
        }
        reader.close();
        writer.close();
    }
}
