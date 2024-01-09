package com.infinite.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	/*public static void main(String[] args) {
		getRowCount();
		getColumnCount();
		getCellDataString();
		getCellDataNumber();
	}*/

	public ExcelUtils(String excelPath, String sheetName){
		try{
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	public static int getRowCount() {
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("Number of rows:" + rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return rowCount;
	}

	public static int getColumnCount() {
		int columnCount = 0;
		try {
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("Number of Column:" + columnCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return columnCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("Cell Data: " + cellData);

			/*
			 * for(int i=0; i<=1 ;i++){ for(int j=0; j<=1 ;j++){ String celldata
			 * = sheet.getRow(i).getCell(j).getStringCellValue();
			 * System.out.print(celldata+"\t"); } System.out.println(); }
			 */

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return cellData;
	}

	public static double getCellDataNumber(int rowNum, int colNum) {
		double cellData = 0;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println("Cell Data: " + cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return cellData;
	}
}
