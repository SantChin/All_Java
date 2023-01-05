package com.san.arrays;

import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

public class CreateWordTableWithBulletList {
 public static void main(String[] args) throws Exception {

  XWPFDocument document = new XWPFDocument();

  XWPFParagraph paragraph = document.createParagraph();
  XWPFRun run=paragraph.createRun();  
  run.setText("The table:");

  XWPFTable ltable = document.createTable(1,1);

  ltable.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(5000));
  CTTblWidth tblWidth = ltable.getRow(0).getCell(0).getCTTc().addNewTcPr().addNewTcW();
  tblWidth.setW(BigInteger.valueOf(5000));
  tblWidth.setType(STTblWidth.DXA);

  ltable.getRow(0).getCell(0).getParagraphs().get(0).createRun().setText("The list:");

  ArrayList<String> documentList = new ArrayList<String>(
   Arrays.asList(
    new String[] {
     "documentList item 1",
     "documentList item 2",
     "documentList item 3"
    }));


//your code with supplements

  CTAbstractNum cTAbstractNum = CTAbstractNum.Factory.newInstance();
  //Next we set the AbstractNumId. This requires care. 
  //Since we are in a new document we can start numbering from 0. 
  //But if we have an existing document, we must determine the next free number first.
  cTAbstractNum.setAbstractNumId(BigInteger.valueOf(0));

/* Bullet list
  CTLvl cTLvl = cTAbstractNum.addNewLvl();
  cTLvl.setIlvl(BigInteger.valueOf(0)); // set indent level 0
  cTLvl.addNewNumFmt().setVal(STNumberFormat.BULLET);
  cTLvl.addNewLvlText().setVal("\u2022");
*/

///* Decimal list
  CTLvl cTLvl = cTAbstractNum.addNewLvl();
  cTLvl.setIlvl(BigInteger.valueOf(0)); // set indent level 0
  cTLvl.addNewNumFmt().setVal(STNumberFormat.DECIMAL);
  cTLvl.addNewLvlText().setVal("%1.");
  cTLvl.addNewStart().setVal(BigInteger.valueOf(1));
//*/

  XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);

  XWPFNumbering numbering = document.createNumbering();

  BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);

  BigInteger numID = numbering.addNum(abstractNumID);

  for (String string : documentList) {
      XWPFTableRow lnewRow = ltable.createRow();
      XWPFTableCell lnewCell = lnewRow.getCell(0);
      XWPFParagraph lnewPara = null;
      if (lnewCell.getParagraphs().size() > 0) {
          lnewPara = lnewCell.getParagraphs().get(0);
      } else {
          lnewPara = lnewCell.addParagraph();
      }
      lnewPara.setNumID(numID);
      XWPFRun lnewRun = lnewPara.createRun();
      lnewRun.setText(string); 
  }

//your code end

  paragraph = document.createParagraph();

  FileOutputStream out = new FileOutputStream("C:\\Users\\Santosh\\Desktop\\INDEXES\\" +"CreateWordTableWithBulletList.docx");    
  document.write(out);
  out.close();

  System.out.println("CreateWordTableWithBulletList written successully");
 }
 
 
 private static void generateParaGraph(XWPFDocument doc1, List<VariosDTO> varios) {
	    CTAbstractNum cTAbstractNum = CTAbstractNum.Factory.newInstance();
	    cTAbstractNum.setAbstractNumId(BigInteger.valueOf(0));
	    CTLvl cTLvl = cTAbstractNum.addNewLvl();
	    cTLvl.addNewNumFmt().setVal(STNumberFormat.BULLET);
	    //CTLevelText a = cTLvl.addNewLvlText();

	    XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);
	    XWPFNumbering numbering = doc1.createNumbering();
	    BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);
	    BigInteger numID = numbering.addNum(abstractNumID);
	    for (VariosDTO item : varios){
	        XWPFParagraph bulletedPara = doc1.createParagraph();
	        XWPFRun run = bulletedPara.createRun();
	        //run.setFontFamily(ARIAL);
	        run.setFontSize(10);
	        run.setText(item.getData());
	        bulletedPara.setNumID(numID);
	    }
	}
}



