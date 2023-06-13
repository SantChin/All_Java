package com.san.xmlsplitting.sax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SheetDataSAXParser_V1 extends DefaultHandler {

	static String inputPath = "C:\\Users\\Santosh\\Desktop\\Large XML\\sheet7.xml";
	static String outPutPath = "C:\\Users\\Santosh\\Desktop\\Large XML\\split\\";

	static int rowSize = 1000;

	public static void main(String[] args) {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			SheetDataSAXParser_V1 handler = new SheetDataSAXParser_V1();
			saxParser.parse(new File(inputPath), handler);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	FileOutputStream mainFile = null;
	FileOutputStream sheetDataFile = null;
	int fileCounter = 0;
	int rowCounter = 0;
	boolean inSheetData = false;
	boolean inROw = false;
	boolean inMain = true;

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		//System.out.println(qName);
		if (qName.equalsIgnoreCase("sheetData")) {
			inSheetData = true;
			inMain = false;
			fileCounter++;
			try {
				mainFile.write(("<sheetData id='" + fileCounter + "'>\n").getBytes());
				sheetDataFile = new FileOutputStream(outPutPath + "sheetData" + fileCounter + ".xml");
				sheetDataFile.write("<sheetData>\n".getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (qName.equalsIgnoreCase("row") || inROw) {
			try {
				if (qName.equalsIgnoreCase("row")) {
					rowCounter++;
				}
				if (rowCounter > rowSize) {
					sheetDataFile.write("</sheetData>\n".getBytes());
					sheetDataFile.close();
					rowCounter = 1;
					fileCounter++;
					sheetDataFile = new FileOutputStream(outPutPath + "sheetData" + fileCounter + ".xml");
					sheetDataFile.write("<sheetData>\n".getBytes());
				}
				inROw = true;
				sheetDataFile.write(("<" + qName + " ").getBytes());
				for (int i = 0; i < attributes.getLength(); i++) {
					sheetDataFile.write((attributes.getQName(i) + "='" + attributes.getValue(i) + "' ").getBytes());
				}
				sheetDataFile.write(">".getBytes());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (inMain) {
			try {
				mainFile.write(("<" + qName + " ").getBytes());
				for (int i = 0; i < attributes.getLength(); i++) {
					mainFile.write((attributes.getQName(i) + "='" + attributes.getValue(i) + "' ").getBytes());
				}
				mainFile.write(">".getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void characters(char ch[], int start, int length) throws SAXException {
		if (inSheetData) {
			try {
				sheetDataFile.write((new String(ch, start, length).replace("&", "&amp;") + "\n").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (inMain) {
			try {
				mainFile.write((new String(ch, start, length).replace("&", "&amp;") + "\n").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("sheetData")) {
			inSheetData = false;
			inMain = true;
			inROw =  false;
			try {
				mainFile.write("</sheetData>\n".getBytes());
				sheetDataFile.write("</sheetData>\n".getBytes());
				sheetDataFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (inMain) {
			try {
				mainFile.write(("</" + qName + ">").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(inROw) {
			try {
				sheetDataFile.write(("</" + qName + ">").getBytes());
				if (qName.equalsIgnoreCase("row")){
					inROw =  false;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void startDocument() throws SAXException {
		try {
			mainFile = new FileOutputStream(outPutPath + "main.xml");
			mainFile.write("<xml>\n".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void endDocument() throws SAXException {
		try {
			mainFile.write("</xml>\n".getBytes());
			mainFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
