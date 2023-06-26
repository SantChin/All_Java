package com.san.pdf;

import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFStreamParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDStream;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HyperlinkExtractor {
    public static void main(String[] args) {
//        try (PDDocument document = PDDocument.load(new File("input.pdf"))) {
//            for (PDPage page : document.getPages()) {
//                PDStream contents = page.getContents();
//                if (contents != null) {
//                    PDFStreamParser parser = new PDFStreamParser(contents.getStream());
//                    parser.parse();
//
//                    List<Object> tokens = parser.getTokens();
//                    for (int i = 0; i < tokens.size(); i++) {
//                        Object token = tokens.get(i);
//                        if (token instanceof COSDictionary) {
//                            COSDictionary dictionary = (COSDictionary) token;
//                            if (dictionary.containsKey(COSName.SUBTYPE) &&
//                                    dictionary.getDictionaryObject(COSName.SUBTYPE).equals(COSName.LINK)) {
//                                COSString uri = (COSString) dictionary.getDictionaryObject(COSName.URI);
//                                if (uri != null) {
//                                    String url = uri.getString();
//                                    String linkText = extractLinkText(tokens, i);
//                                    System.out.println("URL: " + url);
//                                    System.out.println("Link Text: " + linkText);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
      //  }
}
    

    private static String extractLinkText(List<Object> tokens, int currentIndex) {
        StringBuilder linkText = new StringBuilder();
        for (int i = currentIndex - 1; i >= 0; i--) {
            Object token = tokens.get(i);
            if (token instanceof COSString) {
                linkText.insert(0, ((COSString) token).getString());
            } else if (token instanceof String) {
                linkText.insert(0, (String) token);
            } else {
                break;
            }
        }
        return linkText.toString();
    }
}

