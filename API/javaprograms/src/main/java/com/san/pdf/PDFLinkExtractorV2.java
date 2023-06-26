package com.san.pdf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSObject;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

public class PDFLinkExtractorV2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Santosh\\Desktop\\PDF Links Implemetation\\Link Test V5.pdf");

		try (PDDocument document = PDDocument.load(file)) {
			List<Hyperlink> hyperlinks = extractLinks(document);
			for (Hyperlink hyperlink : hyperlinks) {
				System.out.println("Link Text: " + hyperlink.getText());
				System.out.println("Link URL: " + hyperlink.getUrl());
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Hyperlink> extractLinks(PDDocument document) throws IOException {
		List<Hyperlink> hyperlinks = new ArrayList<>();

		int pageNo = 0;
		for (PDPage page : document.getPages()) {
			
			pageNo ++;
			List<COSBase> annotsLinks = new ArrayList<COSBase>();
			getAnnotsLinks(page.getCOSObject(), annotsLinks);

			//COSObject
			
			if (!annotsLinks.isEmpty()) {
				for (COSBase annotBase : annotsLinks) {
					if (annotBase instanceof COSArray) {
						COSArray annotArray = (COSArray) annotBase;
						for (int j = 0; j < annotArray.size(); j++) {
							COSObject _cosObject = (COSObject)annotArray.get(j);
							COSBase annotObj = _cosObject.getObject();
							
							System.out.println(_cosObject);
							System.out.println(annotObj);
							
							if (annotObj instanceof COSDictionary) {
								
								PDAnnotation annotation = PDAnnotation.createAnnotation(annotObj);
								
								if (annotation instanceof PDAnnotationLink) {
									PDAnnotationLink linkAnnotation = (PDAnnotationLink) annotation;
									COSBase actionBase = linkAnnotation.getAction().getCOSObject();
											//.getDictionaryObject(COSName.A);
									if (actionBase instanceof COSDictionary) {
										COSDictionary actionDict = (COSDictionary) actionBase;
										COSString uri = (COSString) actionDict.getItem(COSName.URI);
										if (uri != null) {
											String text = linkAnnotation.getContents();
											String url = uri.getString();
											hyperlinks.add(new Hyperlink(text, url,pageNo));
										}
									}
								}
							}
							
							
							
						}
					}

				}
			}
		}

		return hyperlinks;
	}

	static class Hyperlink {
		private String text;
		private String url;
		private int pageNo;

		public Hyperlink(String text, String url,int pageNo) {
			this.text = text;
			this.url = url;
			this.pageNo = pageNo;
		}

		public String getText() {
			return text;
		}

		public String getUrl() {
			return url;
		}
	}

	private static List<COSBase> getAnnotsLinks(COSBase object, List<COSBase> annotsLinksList) {
		if (object instanceof COSDictionary) {
			COSDictionary dictionary = (COSDictionary) object;
			for (COSName key : dictionary.keySet()) {
				if (key.equals(COSName.ANNOTS)) {
					COSBase value = dictionary.getItem(key);
					annotsLinksList.add(value);
					System.out.println(value);
					getAnnotsLinks(value, annotsLinksList);
				}
			}
		}
		return annotsLinksList;
	}
}
