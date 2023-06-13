package com.san.xmlsplitting.sax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.io.FileUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLSplitterSAX extends DefaultHandler {
    private final int SPLIT_SIZE = 10;
    private int count = 0;
    private int fileCount = 1;
    private List<String> elementList = new ArrayList<>();
    private OutputStreamWriter writer = null;
    
    private static String outPutPath = "C:\\Users\\Santosh\\Desktop\\Large XML\\split\\";

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        try {
            if (count % SPLIT_SIZE == 0) {
                if (writer != null) {
                    writer.write("</root>");
                    writer.flush();
                    writer.close();
                }
                writer = new OutputStreamWriter(new FileOutputStream(outPutPath +"output" + fileCount + ".xml"), "UTF-8");
                writer.write("<root>");
                fileCount++;
            }
            count++;
            StringBuilder sb = new StringBuilder();
            sb.append("<").append(qName);
            for (int i = 0; i < attributes.getLength(); i++) {
                sb.append(" ").append(attributes.getQName(i)).append("=").append("\"").append(attributes.getValue(i)).append("\"");
            }
            sb.append(">");
            elementList.add(sb.toString());
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        try {
            elementList.add("</" + qName + ">");
            if (count % SPLIT_SIZE == 0) {
                for (String element : elementList) {
                    writer.write(element);
                }
                elementList.clear();
            }
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        try {
            String value = new String(ch, start, length);
            if (count % SPLIT_SIZE == 0) {
                for (String element : elementList) {
                    writer.write(element);
                }
                elementList.clear();
            }
            elementList.add(value);
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }
    
//    public static void main(String[] args) {
// 			try {
// 			   File inputFile = new File("C:\\Users\\Santosh\\Desktop\\Large XML\\sheet7.xml");
// 				SAXParserFactory factory = SAXParserFactory.newInstance();
// 				SAXParser saxParser = factory.newSAXParser();
// 				XMLSplitterSAX handler = new XMLSplitterSAX();
// 				saxParser.parse(inputFile, handler);
// 				handler.writer.write("</root>");
// 				handler.writer.flush();
// 				handler.writer.close();
// 			} catch (Exception e) {
// 				e.printStackTrace();
// 			}
// 		}

    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\Santosh\\Desktop\\Large XML\\sheet6.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLSplitterSAX handler = new XMLSplitterSAX();
            saxParser.parse(inputFile, handler);
            handler.writer.write("</root>");
            handler.writer.flush();
            handler.writer.close();
            
            for (int i = 1; i < handler.fileCount; i++) {
                File outputFile = new File(outPutPath+"output_temp" + i + ".xml");
                FileOutputStream fos = new FileOutputStream(outputFile);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                osw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                osw.write("<root>");
                osw.write(readFile(outPutPath+"output" + i + ".xml", "UTF-8"));
                osw.write("</root>");
                osw.flush();
                osw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String readFile(String file, String encoding) throws Exception {
       // byte[] encoded = Files.readAllBytes(Paths.get(file));
        byte[] encoded =  FileUtils.readFileToByteArray(new File(file));
        return new String(encoded, encoding);
    }

}
