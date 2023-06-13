package com.san.xmlsplitting;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;

public class FormatXML_V3 {
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\Santosh\\Desktop\\Large XML\\ENT 22\\sheet1.xml";
		String filePath_new = "C:\\Users\\Santosh\\Desktop\\Large XML\\ENT 22\\sheet1_temp.xml";
		formatXML(filePath,filePath_new);
		System.out.println("Done");
	}
	
  public static void formatXML(String inputFilePath, String outputFilePath) {
    try {
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      Document document = documentBuilder.parse(new File(inputFilePath));

      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      //transformerFactory.setAttribute("indent-number", 4);
      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

      StringWriter writer = new StringWriter();
      transformer.transform(new DOMSource(document), new StreamResult(writer));

      FileWriter fileWriter = new FileWriter(outputFilePath);
      fileWriter.write(writer.toString());
      fileWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

