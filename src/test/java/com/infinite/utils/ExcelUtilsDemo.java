package com.infinite.utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "/excel/data.xlsx";
		
		ExcelUtils excel = new ExcelUtils(excelPath, "sheet1");
		
		excel.getRowCount();
		excel.getColumnCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumber(1,1);
	}
}
