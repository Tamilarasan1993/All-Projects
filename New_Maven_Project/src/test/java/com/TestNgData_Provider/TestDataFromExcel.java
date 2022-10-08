package com.TestNgData_Provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
	
	// public static String[][] DataProvider_ALLDATA(int sheet) throws IOException {
		File f = new File("C:\\Users\\Jayasri\\Desktop\\Cricket.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		int rows  = s.getPhysicalNumberOfRows();
		Row col = s.getRow(rows);
		int cells = col.getPhysicalNumberOfCells();
		//String[][] data = new String[rows][cells];
		
		for(int i=0;i<rows;i++) {
			Row r =	s.getRow(i);
			for(int j=0;j<cells;j++) {
		
			System.out.println(s.getRow(i).getCell(j).getStringCellValue());
			}
		}
			//			Cell c= r.getCell(j);
//			
//			CellType type = c.getCellType();				
//			if(type.equals(CellType.STRING)) {
//				c.getStringCellValue();
//			}
//			else if (type.equals(CellType.NUMERIC)) {
//				c.getNumericCellValue();
//			}
//			else {
//				System.out.println("Not Found Or Blank");
//			}
		
	//wb.close();
		}
		//return data;
	

	}
		
	
	


