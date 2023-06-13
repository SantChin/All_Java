package com.san.xmlsplitting;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.StringWriter;

public class FormatXML {
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\Santosh\\Desktop\\Large XML\\sheet11.xml";
		formatXML(filePath);
	}
	
	
  public static void formatXML(String filePath) {
    try {
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(new File(filePath));

      TransformerFactory transformerFactory = TransformerFactory.newInstance();
     // transformerFactory.setAttribute("indent-number", 4);
      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

      StringWriter writer = new StringWriter();
      transformer.transform(new DOMSource(document), new StreamResult(writer));

      System.out.println(writer.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
