package com.san.pdf;

import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class PrintPDF {
    public static void main(String[] args) {
        try (PDDocument document = PDDocument.load(new File("C:\\Users\\Santosh\\Desktop\\PDF Links Implemetation\\PDF Link Test.pdf"))) {
            printStructure(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printStructure(PDDocument document) {
        for (PDPage page : document.getPages()) {
           // System.out.println("Page: " + page.getLogicalStructure());
        	
        	// COSBase base = page.getDictionaryObject(COSName.CONTENTS);
            printObjectStructure(page.getCOSObject(), 0);
        }
    }

    private static void printObjectStructure(COSBase object, int depth) {
        String indent = createIndent(depth);
        System.out.println(indent + "Object: " + object);
        if (object instanceof COSDictionary) {
            COSDictionary dictionary = (COSDictionary) object;
            for (COSName key : dictionary.keySet()) {
                if (key.equals(COSName.ANNOTS)) {
					COSBase value = dictionary.getItem(key);
					System.out.println(indent + "  Key: " + key.getName());
					printObjectStructure(value, depth + 1);
				}
            }
        } 
        
//        else if (object instanceof COSArray) {
//            COSArray array = (COSArray) object;
//            for (int i = 0; i < array.size(); i++) {
//                COSBase value = array.get(i);
//                System.out.println(indent + "  Index: " + i);
//                printObjectStructure(value, depth + 1);
//            }
//        }
    }

    private static String createIndent(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }
}
