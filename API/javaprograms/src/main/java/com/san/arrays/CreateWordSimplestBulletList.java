package com.san.arrays;

import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.xwpf.usermodel.XWPFAbstractNum;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat;

public class CreateWordSimplestBulletList {

 public static void main(String[] args) throws Exception {

  ArrayList<String> documentList = new ArrayList<String>(
   Arrays.asList(
    new String[] {
     "One",
     "Two",
     "Three"
    }));

  CTAbstractNum cTAbstractNum = CTAbstractNum.Factory.newInstance();
  //Next we set the AbstractNumId. This requires care.
  //Since we are in a new document we can start numbering from 0.
  //But if we have an existing document, we must determine the next free number first.
  cTAbstractNum.setAbstractNumId(BigInteger.valueOf(0));

  //Bullet list
  CTLvl cTLvl = cTAbstractNum.addNewLvl();
  cTLvl.setIlvl(BigInteger.valueOf(0)); // set indent level 0
  cTLvl.addNewNumFmt().setVal(STNumberFormat.BULLET);
  cTLvl.addNewLvlText().setVal("•");

  XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);
  XWPFDocument document = new XWPFDocument();
  XWPFNumbering numbering = document.createNumbering();

  BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);
  BigInteger numID = numbering.addNum(abstractNumID);

  XWPFParagraph paragraph = document.createParagraph();
  XWPFRun run=paragraph.createRun();
  run.setText("The default list:");

  for (String string : documentList) {
   paragraph = document.createParagraph();
   paragraph.setNumID(numID);
   // font size for bullet point in half pt
   paragraph.getCTP().getPPr().addNewRPr().addNewSz().setVal(BigInteger.valueOf(48));
   run = paragraph.createRun();
   run.setText(string);
   run.setFontSize(24);
  }

  paragraph = document.createParagraph();

  paragraph = document.createParagraph();
  run=paragraph.createRun();
  run.setText("The list having defined gap between bullet point and text:");

  for (String string : documentList) {
   paragraph = document.createParagraph();
   paragraph.setNumID(numID);
   paragraph.getCTP().getPPr().addNewRPr().addNewSz().setVal(BigInteger.valueOf(48));
   // set indents in Twips (twentieth of an inch point, 1440 Twips = 1 inch 
   paragraph.setIndentationLeft(1440/4); // indent from left 360 Twips = 1/4 inch
   paragraph.setIndentationHanging(1440/4); // indentation hanging 360 Twips = 1/4 inch
                                            // so bullet point hangs 1/4 inch before the text at indentation 0
   run = paragraph.createRun();
   run.setText(string);
   run.setFontSize(24);
  }
  
  for (String string : documentList) {
	   paragraph = document.createParagraph();
	   paragraph.setNumID(numID);
	   paragraph.getCTP().getPPr().addNewRPr().addNewSz().setVal(BigInteger.valueOf(48));
	   // set indents in Twips (twentieth of an inch point, 1440 Twips = 1 inch 
	   paragraph.setIndentationLeft(1440/8); // indent from left 360 Twips = 1/4 inch
	   paragraph.setIndentationHanging(1440/8); // indentation hanging 360 Twips = 1/4 inch
	                                            // so bullet point hangs 1/4 inch before the text at indentation 0
	   run = paragraph.createRun();
	   run.setText(string);
	   run.setFontSize(24);
	  }
  
  for (String string : documentList) {
	   paragraph = document.createParagraph();
	   paragraph.setNumID(numID);
	   paragraph.getCTP().getPPr().addNewRPr().addNewSz().setVal(BigInteger.valueOf(48));
	   // set indents in Twips (twentieth of an inch point, 1440 Twips = 1 inch 
	   paragraph.setIndentationLeft(1440/8); // indent from left 360 Twips = 1/4 inch
	   paragraph.setIndentationHanging(1440/8); // indentation hanging 360 Twips = 1/4 inch
	                                            // so bullet point hangs 1/4 inch before the text at indentation 0
	   run = paragraph.createRun();
	   run.setText(string);
	   run.setFontSize(24);
	  }

  paragraph = document.createParagraph();

  FileOutputStream out = new FileOutputStream("C:\\Users\\Santosh\\Desktop\\INDEXES\\" +"CreateWordSimplestBulletList.docx");
  document.write(out);
  out.close();
  System.out.println("Done");
 }
}