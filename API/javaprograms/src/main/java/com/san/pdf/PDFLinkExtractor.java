package com.san.pdf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.contentstream.PDFStreamEngine;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;

public class PDFLinkExtractor extends PDFStreamEngine {
    private List<Hyperlink> hyperlinks;

    public PDFLinkExtractor() {
        this.hyperlinks = new ArrayList<>();
    }

    public List<Hyperlink> getHyperlinks() {
        return hyperlinks;
    }

    @Override
    protected void processOperator(Operator operator, List<COSBase> operands) throws IOException {
        String operation = operator.getName();
        if ("Tj".equals(operation)) {
            extractLinkFromText(operands);
        }
        super.processOperator(operator, operands);
    }

    
    @Override
	protected void processAnnotation(PDAnnotation _pDAnnotation, PDAppearanceStream appearance) throws IOException {
    	
    	if(_pDAnnotation instanceof PDAnnotationLink) {
			PDAnnotationLink link = (PDAnnotationLink)_pDAnnotation;
			extractLinkFromAnnotation(link);
           
			
			if (link.getAction() != null && link.getAction() instanceof PDActionURI) {
				 PDActionURI action = (PDActionURI) link.getAction();
                    String linkText = link.getContents();
                    String linkURL = action.getURI();

                    // Extracted Link Information
                    System.out.println("Link Text: " + linkText);
                    System.out.println("Link URL: " + linkURL);
                    System.out.println();
            
			}
		}
		super.processAnnotation(_pDAnnotation, appearance);
	}

	private void extractLinkFromText(List<COSBase> operands) {
        for (COSBase operand : operands) {
            if (operand instanceof COSString) {
                COSString cosString = (COSString) operand;
                String text = cosString.getString();
                if (text.contains("http://") || text.contains("https://")) {
                    hyperlinks.add(new Hyperlink(text, ""));
                }
            }
        }
    }

    private void extractLinkFromAnnotation(PDAnnotationLink link) {
        COSBase action = link.getCOSObject().getItem(COSName.A);
        if (action instanceof COSDictionary) {
            COSDictionary actionDict = (COSDictionary) action;
            COSString uri = (COSString) actionDict.getItem(COSName.URI);
            if (uri != null) {
                String url = uri.getString();
//                PDAnnotationTextMarkup textMarkup = (PDAnnotationTextMarkup) link;
//                String text = textMarkup.getContents();
                hyperlinks.add(new Hyperlink("1", url));
            }
        }
    }
    
    
    private void extractLinkFromAnnotationV2(PDAnnotationLink link) {
        COSBase action = link.getCOSObject().getItem(COSName.A);
        if (action instanceof COSDictionary) {
            COSDictionary actionDict = (COSDictionary) action;
            COSString uri = (COSString) actionDict.getItem(COSName.URI);
            if (uri != null) {
                String url = uri.getString();
                String text = link.getContents();
                hyperlinks.add(new Hyperlink(text, url));
            }
        }
    }

}
