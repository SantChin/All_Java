package com.san.xmlsplitting;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SplitAndParseXML {
  public static void main(String[] args) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    File inputFile = new File("C:\\Users\\Santosh\\Desktop\\Large XML\\sheet11.xml");
    Document document = builder.parse(inputFile);
   

    XPath xpath = XPathFactory.newInstance().newXPath();
    NodeList nodes = (NodeList) xpath.evaluate("//node", document, XPathConstants.NODESET);

    for (int i = 0; i < nodes.getLength(); i++) {
      Node node = nodes.item(i);

      Document newDoc = builder.newDocument();
      newDoc.appendChild(newDoc.importNode(node, true));

      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      transformer.transform(new DOMSource(newDoc), new StreamResult(new File("small_output_" + i + ".xml")));
    }

    for (int i = 0; i < nodes.getLength(); i++) {
      Document smallDoc = builder.parse(new File("small_output_" + i + ".xml"));

      // Parsing code goes here
    }
  }
}
