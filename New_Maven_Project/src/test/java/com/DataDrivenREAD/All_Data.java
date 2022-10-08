package com.DataDrivenREAD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	public static String value;
	
	public static void TestDataAll() throws IOException {
		System.out.println("All Data\n");
		File f3 = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\DataDriven.xlsx");
		FileInputStream fis3 = new FileInputStream(f3);
		Workbook wb3 =new  XSSFWorkbook(fis3);
		Sheet s3 = wb3.getSheetAt(0);
		for(int i=0;i<s3.getPhysicalNumberOfRows();i++) {
			Row r3 = s3.getRow(i);
			for(int j=0;j<r3.getPhysicalNumberOfCells();j++) {
			Cell c3 = r3.getCell(j);	
				CellType type = c3.getCellType();
			if(type.equals(CellType.STRING)) {
				value = c3.getStringCellValue();
				System.out.println(value);
			}
			else if (type.equals(CellType.NUMERIC)) {
				double d = c3.getNumericCellValue();
				int a = (int)d;
				value = String.valueOf(a);
				System.out.println(value);
			}
			else {
				System.out.println("Not Found");
			}
			}
		}
		wb3.close();
	}
public static void main(String[] args) throws IOException {
	TestDataAll();
}
}
