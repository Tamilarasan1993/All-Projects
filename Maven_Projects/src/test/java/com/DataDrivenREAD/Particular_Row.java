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

public class Particular_Row {
	public static String value;
	public static void TestData2() throws IOException {
		System.out.println("Particular ROW data is :");
		File f1 = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\DataDriven.xlsx");
		FileInputStream fis1 = new FileInputStream(f1);
		Workbook wb1 = new XSSFWorkbook(fis1);
		Sheet s1 = wb1.getSheetAt(0);
		Row r1 = s1.getRow(2);
		for (int i = 0; i<r1.getPhysicalNumberOfCells();i++) {
			Cell cell = r1.getCell(i);
		CellType type= cell.getCellType();
			if(type.equals(CellType.STRING)) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if (type.equals(CellType.NUMERIC)) {
				double d = cell.getNumericCellValue();
				int a = (int)d;
				value = String.valueOf(a);
				System.out.println(value);
			}
			else {
				System.out.println("Not Found");
			}
		}
	wb1.close();
	}
	public static void main(String[] args) throws IOException {
		TestData2();
	}
		

}
