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

public class Paticular_Cell {

	public static void TestData() throws IOException {
		System.out.println("Particular Cell Value is :");
		File f = new File("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\DataDriven.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);		
		Sheet ss = wb.getSheetAt(0);
		Row r = ss.getRow(4);
		Cell cel = r.getCell(1);
		CellType type = cel.getCellType();
		if (type.equals(CellType.STRING)) {
			System.out.println(cel.getCellType());
		}
		else if (type.equals(CellType.NUMERIC)) {
			double d = cel.getNumericCellValue();
			int i = (int) d;
			String valueOf = String.valueOf(i);
			System.out.println(valueOf);
		} 
		else {
			System.out.println("Not Found");
		}
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		TestData();
	}

}
