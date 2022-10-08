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

import junit.extensions.TestDecorator;

public class Particular_Column {
	public static String value;
	public static void TestDataColumn() throws IOException {
		System.out.println("Particular Column Data is :");
		File f2 = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\DataDriven.xlsx");
		FileInputStream fis2=new FileInputStream(f2);
		Workbook wb2 = new XSSFWorkbook(fis2);
		Sheet ss = wb2.getSheetAt(0);
		
			for(int i =0;i<ss.getPhysicalNumberOfRows();i++) {
			Row r2 = ss.getRow(i);
			Cell cell = r2.getCell(2);
			CellType type = cell.getCellType();
			if(type.equals(CellType.STRING)) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if (type.equals(CellType.NUMERIC)) {
				double d = cell.getNumericCellValue();
				int a =(int)d;
				value = String.valueOf(a);
				System.out.println(value);
			}
			else {
				System.out.println("Not Found");
			}
		}
		wb2.close();
	}
	public static void main(String[] args) throws IOException {
		TestDataColumn();
	}

}
