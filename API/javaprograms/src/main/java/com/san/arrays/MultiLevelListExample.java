package com.san.arrays;

import org.apache.poi.xwpf.usermodel.XWPFAbstractNum;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;


public class MultiLevelListExample {
    public static void main(String[] args){

        XWPFDocument doc = new XWPFDocument();

        BigInteger numId = getNumId(doc);           //set up the numbering scheme

        createNumberedParagraph(doc, numId, "Subject 01", BigInteger.ZERO);     //first indent level
        createNumberedParagraph(doc, numId, "Item 01", BigInteger.ONE);         //second indent level
        createNumberedParagraph(doc, numId, "Item 02", BigInteger.ONE);
        createNumberedParagraph(doc, numId, "INNER 01", BigInteger.valueOf(2));         //second indent level
        createNumberedParagraph(doc, numId, "INNER 02", BigInteger.valueOf(2));
        createNumberedParagraph(doc, numId, "Subject 02", BigInteger.ZERO);
        createNumberedParagraph(doc, numId, "Item 03", BigInteger.ONE);
        createNumberedParagraph(doc, numId, "Item 04", BigInteger.ONE);

        /*produce the document*/
        try {
            File outputReport = new File("C:\\Users\\Santosh\\Desktop\\INDEXES\\" +"report.docx");

            FileOutputStream output = new FileOutputStream(outputReport);
            doc.write(output);

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method creates a numbering scheme and associates it with the working document
     * @param document the document in which the numbering scheme will be used
     * @return The ID for the created numbering scheme
     */
    public static BigInteger getNumId(XWPFDocument document){

        CTAbstractNum cTAbstractNum = CTAbstractNum.Factory.newInstance();      //create a numbering scheme
        cTAbstractNum.setAbstractNumId(BigInteger.valueOf(0));                  //give the scheme an ID

        /*first level*/
        CTLvl cTLvl0 = cTAbstractNum.addNewLvl();               //create the first numbering level
        cTLvl0.setIlvl(BigInteger.ZERO);                        //mark it as the top outline level
        cTLvl0.addNewNumFmt().setVal(STNumberFormat.DECIMAL);   //set the number format
        cTLvl0.addNewLvlText().setVal("%1.");                   //set the adornment; %1 is the first-level number or letter as set by number format
        cTLvl0.addNewStart().setVal(BigInteger.valueOf(2));            //set the starting number (here, index from 1)
        cTLvl0.addNewSuff().setVal(STLevelSuffix.SPACE);        //set space between number and text

        /*second level*/
        CTLvl cTLvl1 = cTAbstractNum.addNewLvl();               //create another numbering level
        cTLvl1.setIlvl(BigInteger.ONE);                         //specify that it's the first indent
        CTInd ctInd = cTLvl1.addNewPPr().addNewInd();           //add an indent
        ctInd.setLeft(inchesToTwips(.5));                       //set a half-inch indent
        cTLvl1.addNewNumFmt().setVal(STNumberFormat.DECIMAL);   //the rest is fairly similar
        cTLvl1.addNewLvlText().setVal("%1.%2.");                //setup to get 1.1, 1.2, ect.
        cTLvl1.addNewStart().setVal(BigInteger.valueOf(2));
        cTLvl1.addNewSuff().setVal(STLevelSuffix.SPACE);

        /*associate the numbering scheme with the document's numbering*/
        XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);
        XWPFNumbering numbering = document.createNumbering();
        BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);
        /*return an ID for the numbering*/
        return numbering.addNum(abstractNumID);
    }

    /**
     * @param inches
     * @return twentieths of a point (twips)
     */
    private static BigInteger inchesToTwips(double inches) {
        return BigInteger.valueOf((long) (1440L * inches));
    }


    /**
     * creates a numbered list item at the specified depth
     * @param doc the document
     * @param numId the numbering setup for the document
     * @param paragraphText the paragraph being created
     * @param numLevel the indent level in the list
     */
    private static void createNumberedParagraph(XWPFDocument doc, BigInteger numId, String paragraphText, BigInteger numLevel) {
        XWPFParagraph paragraph = doc.createParagraph();        //create the paragraph
        paragraph.createRun().setText(paragraphText);           //fill text
        paragraph.setNumID(numId);                              //make it numbered
        CTDecimalNumber ctDecimalNumber = paragraph.getCTP().getPPr().getNumPr().addNewIlvl();
        ctDecimalNumber.setVal(numLevel);                       //set the indent level
    }
}
