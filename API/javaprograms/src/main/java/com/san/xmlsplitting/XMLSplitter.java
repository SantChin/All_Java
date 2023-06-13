package com.san.xmlsplitting;

import java.io.File;
import java.io.FileWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLSplitter {

	public static void main(String[] args) {
	    try {
	      File inputFile = new File("C:\\Users\\Santosh\\Desktop\\Large XML\\sheet1.xml");
	      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	      Document doc = dBuilder.parse(inputFile);
	      doc.getDocumentElement().normalize();

	      NodeList nodes = doc.getElementsByTagName("element");
	      for (int i = 0; i < nodes.getLength(); i++) {
	        Node node = nodes.item(i);
	        if (node.getNodeType() == Node.ELEMENT_NODE) {
	          Element element = (Element) node;

	          Document smallDoc = dBuilder.newDocument();
	          Node importedNode = smallDoc.importNode(element, true);
	          smallDoc.appendChild(importedNode);

	          File outputFile = new File("small_file_" + i + ".xml");
	          FileWriter writer = new FileWriter(outputFile);
	          smallDoc.getDocumentElement().normalize();
	          writer.write(smallDoc.toString());
	          writer.close();
	        }
	      }
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	}
