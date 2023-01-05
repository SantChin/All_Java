package com.san.arrays;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackageRelationshipTypes;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExternalReferenceV2 {

	public static void main(String[] args) {
		

		try {
			File f = new File("C:\\Users\\Santosh\\Downloads\\2021 Plan Summary - change vs. Oct.xlsx");
			 f.isDirectory();
			 System.out.println(f.getCanonicalPath());
			 InputStream inputStream = new FileInputStream(f);

				ByteArrayOutputStream baos = new ByteArrayOutputStream();

				byte[] buffer = new byte[1024];
				int len;
				while ((len = inputStream.read(buffer)) > -1 ) {
					baos.write(buffer, 0, len);
				}
				baos.flush();
				
					XSSFWorkbook wb = new XSSFWorkbook(new ByteArrayInputStream(baos.toByteArray()));
					if(wb!=null){
						Iterator<Sheet> itr = wb.iterator();
						while(itr!=null && itr.hasNext()){
							Sheet sheet = itr.next();
							if(sheet!=null) {
								Iterator<Row> _itr = sheet.iterator();
								getLinksInSheet(_itr, "", sheet);
							}
						}
					}
			
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getLinksInSheet(Iterator<Row> itr, String string, Sheet sheet) {
		  Iterator<Row> _itr = itr;
		  Map<String,String> relToUrlMap = new HashMap<String, String>();
		  
		  try {
			  if(sheet instanceof XSSFSheet) {
				  PackageRelationshipCollection pkgRlCl =   ((XSSFSheet)sheet).getPackagePart().getRelationshipsByType(XSSFRelation.EXTERNAL_LINKS.getRelation());
				  
				  PackageRelationshipCollection relationships = 
						  ((XSSFSheet) sheet).getPackagePart().getRelationships();
						  //getRelationshipsByType(PackageRelationshipTypes.EXTERNAL_LINK_PATH);
				  if(pkgRlCl!=null && pkgRlCl.size()>0) {
					  Iterator<PackageRelationship> pkItr =   pkgRlCl.iterator();
					  while(pkItr!=null && pkItr.hasNext()) {
						  PackageRelationship rel =   pkItr.next();
						  relToUrlMap.put(rel.getId(), rel.getTargetURI().toString());
					  }
				  }
			  }
		  } catch (Exception e1) {
		}
		  
		
	}
}
