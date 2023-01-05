package com.san.arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.stream.Stream;

import org.dhatim.fastexcel.reader.Cell;
import org.dhatim.fastexcel.reader.CellType;
import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;
import org.dhatim.fastexcel.reader.Sheet;

public class Test9 {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\Santosh\\Desktop\\PATH LINKS\\ValuationModel_EuropeanREA_20000_IncrementalCosts_vJAM.xls");
			InputStream inputStream = new FileInputStream(file);
					//System.out.println(inputStream.available());
			ReadableWorkbook readableWorkbook = new ReadableWorkbook(inputStream);
			Iterator<Sheet> it = readableWorkbook.getSheets().iterator();

			while (it.hasNext()) {
				Sheet sheetDef = it.next();
				try (Stream<Row> data = sheetDef.openStream()) {

					Iterator<Row> rowIt = data.iterator();
					while (rowIt.hasNext()) {
						Row row = rowIt.next();
						for (int i = 0; i < row.getCellCount(); i++) {
							Cell cell = row.getCell(i);

							if(cell!=null) {
								if(cell.getAddress().toString() == "G3") {
									System.out.println("G3");
								}
								if(cell.getType() == CellType.FORMULA) {
									System.out.println(cell.getAddress());
									//System.out.println(cell.getFormula());
									//System.out.println(cell.getDataFormatString());
								} 
							}
						}

					}

				} catch (Exception e) {

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
