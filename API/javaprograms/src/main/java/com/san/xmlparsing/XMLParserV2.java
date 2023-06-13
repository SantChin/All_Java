package com.san.xmlparsing;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLParserV2 {

	public static void main(String[] args) {
		
		
		  try {
			// Create an input factory
			XMLInputFactory factory = XMLInputFactory.newInstance();

			// Create an XMLStreamReader object
			InputStream fis = new FileInputStream("C:\\Users\\Santosh\\AppData\\Local\\Temp\\63ac49a8c2dc438b7532e120\\731\\834\\xl\\worksheets\\sheet1.xml");

			XMLStreamReader reader = factory.createXMLStreamReader(fis);

			// Read the XML document
			List<String> formulas = new ArrayList<>();
			while (reader.hasNext()) {
			    int event = reader.next();
			    if (event == XMLStreamConstants.START_ELEMENT) {
			        String tagName = reader.getLocalName();
			        System.out.println(tagName);
			        if (tagName.equals("formula") || tagName.equals("f") ) {
			            formulas.add(reader.getElementText());
			        }
			    }
			}

			// Print out the formulas
			for (String formula : formulas) {
			    System.out.println(formula);
			}
			
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
