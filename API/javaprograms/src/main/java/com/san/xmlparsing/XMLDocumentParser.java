package com.san.xmlparsing;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class XMLDocumentParser {

	public static void main(String[] args) {
		
		
		try {
			InputStream inputStream = new FileInputStream("C:\\Users\\Santosh\\AppData\\Local\\Temp\\63ac49a8c2dc438b7532e120\\768\\207\\word\\document.xml");
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader reader = factory.createXMLStreamReader(inputStream);
			
			while (reader.hasNext()) {
			    int eventType = reader.next();
			    if (eventType == XMLStreamReader.START_ELEMENT) {
			        String elementName = reader.getLocalName();
			        if (elementName.equals("hyperlink")) {
			            String url = reader.getAttributeValue(null, "id");
			            String linkText = reader.getAttributeValue(null, "t");
			           System.out.println(url + "-->"+linkText);
			        }
			    }
			}

			reader.close();
			
			
		}catch(Exception e) {
			
		}
	}
}
