package com.DataDrivenWRITE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void CreateSheet() throws IOException {
		File f = new File("C:\\Users\\Jayasri\\Desktop\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Marvel").createRow(0).createCell(0).setCellValue("CaptainAmerica");
		wb.getSheet("Marvel").getRow(0).createCell(1).setCellValue("Cap#121");
		wb.getSheet("Marvel").createRow(1).createCell(0).setCellValue("IronMan");
		wb.getSheet("Marvel").getRow(1).createCell(1).setCellValue("Iron$1001");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		CreateSheet();
		
	}
	

}
