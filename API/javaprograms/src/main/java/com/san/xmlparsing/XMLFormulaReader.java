package com.san.xmlparsing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
public class XMLFormulaReader {

	public static void main(String[] args) throws XMLStreamException {
	       // Open the .xlsx file
        try {
			InputStream inputStream = new FileInputStream("C:\\Users\\Santosh\\AppData\\Local\\Temp\\63ac49a8c2dc438b7532e120\\731\\834\\xl\\worksheets\\sheet1.xml");

			// Create an XMLInputFactory and an XMLStreamReader
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			XMLStreamReader streamReader = inputFactory.createXMLStreamReader(inputStream);

			// Loop through the elements of the .xlsx file
			while (streamReader.hasNext()) {
			    int eventType = streamReader.next();
			    if (eventType == XMLStreamReader.START_ELEMENT) {
			        String elementName = streamReader.getLocalName();
			        System.out.println(elementName);
			        if (elementName.equals("c")) {
			            // This is a cell element. Check if it has a formula.
			            String formula = streamReader.getAttributeValue(null, "f");
			            String value = streamReader.getAttributeValue(null, "v");
			            if (formula != null) {
			                // This cell has a formula. Print it.
			                System.out.println(formula);
			                System.out.println(value);
			            }
			        }
			    }
			}

			// Close the stream reader
			streamReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	}

