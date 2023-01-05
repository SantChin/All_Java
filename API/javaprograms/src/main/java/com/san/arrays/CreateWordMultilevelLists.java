package com.san.arrays;

import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xwpf.usermodel.XWPFAbstractNum;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering; 

public class CreateWordMultilevelLists {

 static String cTAbstractNumBulletXML = 
  "<w:abstractNum xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" w:abstractNumId=\"0\">"
+ "<w:multiLevelType w:val=\"hybridMultilevel\"/>"
+ "<w:lvl w:ilvl=\"0\"><w:start w:val=\"1\"/><w:numFmt w:val=\"bullet\"/><w:lvlText w:val=\"\uF0B7\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"720\" w:hanging=\"360\"/></w:pPr><w:rPr><w:rFonts w:ascii=\"Symbol\" w:hAnsi=\"Symbol\" w:hint=\"default\"/></w:rPr></w:lvl>"
+ "<w:lvl w:ilvl=\"1\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"bullet\"/><w:lvlText w:val=\"\u2013\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"1440\" w:hanging=\"360\"/></w:pPr><w:rPr><w:rFonts w:ascii=\"Courier New\" w:hAnsi=\"Courier New\" w:cs=\"Courier New\" w:hint=\"default\"/></w:rPr></w:lvl>"
+ "<w:lvl w:ilvl=\"2\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"bullet\"/><w:lvlText w:val=\"\u26Ac\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"2160\" w:hanging=\"360\"/></w:pPr><w:rPr><w:rFonts w:ascii=\"Courier New\" w:hAnsi=\"Courier New\" w:hint=\"default\"/></w:rPr></w:lvl>"
+ "</w:abstractNum>";   

 static String cTAbstractNumDecimalXML = 
  "<w:abstractNum xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" w:abstractNumId=\"1\">"
+ "<w:multiLevelType w:val=\"hybridMultilevel\"/>"
+ "<w:lvl w:ilvl=\"0\"><w:start w:val=\"1\"/><w:numFmt w:val=\"decimal\"/><w:lvlText w:val=\"%1\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"720\" w:hanging=\"360\"/></w:pPr></w:lvl>"
+ "<w:lvl w:ilvl=\"1\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"decimal\"/><w:lvlText w:val=\"%1.%2\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"1440\" w:hanging=\"360\"/></w:pPr></w:lvl>"
+ "<w:lvl w:ilvl=\"2\" w:tentative=\"1\"><w:start w:val=\"1\"/><w:numFmt w:val=\"decimal\"/><w:lvlText w:val=\"%1.%2.%3\"/><w:lvlJc w:val=\"left\"/><w:pPr><w:ind w:left=\"2160\" w:hanging=\"360\"/></w:pPr></w:lvl>"
+ "</w:abstractNum>";

 static BigInteger createNumbering(XWPFDocument document, String abstractNumXML) throws Exception {
  CTNumbering cTNumbering = CTNumbering.Factory.parse(abstractNumXML);
  CTAbstractNum cTAbstractNum = cTNumbering.getAbstractNumArray(0);
  XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);
  XWPFNumbering numbering = document.createNumbering();
  BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);
  BigInteger numID = numbering.addNum(abstractNumID);
  return numID;
 }
 
 static void setIndentLevel(XWPFParagraph paragraph, BigInteger level) {
  if (paragraph.getCTP().isSetPPr()) {
   if (paragraph.getCTP().getPPr().isSetNumPr()) {
    if (paragraph.getCTP().getPPr().getNumPr().isSetIlvl()) {
     paragraph.getCTP().getPPr().getNumPr().getIlvl().setVal(level);
    } else {
    	System.out.println("In");
     paragraph.getCTP().getPPr().getNumPr().addNewIlvl().setVal(level);
    }
   }
  }
 }
 
 static BigInteger getIndentLevelFromNumberingString(String numberingString) {
  String[] levels = numberingString.split("\\.");
  int level = levels.length -1;
  return BigInteger.valueOf(level);
 }
 
 static void insertListContent(XWPFDocument document, TreeMap<String, String> listContent, BigInteger numID) {
  for (Map.Entry<String, String> entry : listContent.entrySet()) {
   String key = entry.getKey();
   String value = entry.getValue();
   XWPFParagraph paragraph = document.createParagraph();
   paragraph.setNumID(numID);
   setIndentLevel(paragraph, getIndentLevelFromNumberingString(key));
   XWPFRun run = paragraph.createRun();
   run.setText(value); 
   if (!entry.equals(listContent.lastEntry())) paragraph.setSpacingAfter(0);
  } 
 }

 public static void main(String[] args) throws Exception {
     
  TreeMap<String, String> listContent = new TreeMap<String, String>();
  listContent.put("1", "One");
  listContent.put("1.1", "AAA");
  listContent.put("1.1.1", "aaa");
  listContent.put("1.1.2", "bbb");
  listContent.put("1.1.3", "ccc");
  listContent.put("1.2", "BBB");
  listContent.put("1.2.1", "xyz");
  listContent.put("1.2.2", "abc");
  listContent.put("2", "Two");
  listContent.put("2.1", "AAA");
  listContent.put("2.1.1", "mmm");
  listContent.put("2.1.2", "nnn");
  listContent.put("2.2", "ZZZ");
  listContent.put("2.2.1", "bbb");
  listContent.put("2.2.2", "nnn");
  
  XWPFDocument document = new XWPFDocument();
  
  BigInteger numIDBulletList = createNumbering(document, cTAbstractNumBulletXML);
  BigInteger numIDDecimalList = createNumbering(document, cTAbstractNumDecimalXML);
  
  XWPFParagraph paragraph = document.createParagraph();
  XWPFRun run=paragraph.createRun();  
  run.setText("The bullet list:");
  
  insertListContent(document, listContent, numIDBulletList);
  
  paragraph = document.createParagraph();
  run=paragraph.createRun();  
  run.setText("Paragraph after the list.");
  
  paragraph = document.createParagraph();
  run=paragraph.createRun();  
  run.setText("The decimal list:");
  
  insertListContent(document, listContent, numIDDecimalList);
  
  paragraph = document.createParagraph();
  run=paragraph.createRun();  
  run.setText("Paragraph after the list.");

  FileOutputStream out = new FileOutputStream("C:\\Users\\Santosh\\Desktop\\INDEXES\\" +"CreateWordMultilevelLists.docx");    
  document.write(out);
  out.close();
  //document.close();

 }
}
