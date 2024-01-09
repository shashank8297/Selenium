package com.infinite.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

/*
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "/excel/data.xlsx";
		//ExcelUtils excel = new ExcelUtils(excelPath, "sheet1");
		testData(excelPath, "sheet1");
	}*/
	
	
	private static WebDriver driver = null;

	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "tes1_data")
	public void test1(String username, String password) throws InterruptedException{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(5000);
		
		
		System.out.println(username+" "+password);
	}
	
	@DataProvider(name ="tes1_data")
	public static Object[][] getData(){
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "/excel/data.xlsx";
		Object data[][] = testData(excelPath, "sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath, String sheetName){
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int columnCount = excel.getColumnCount();
		
		Object data[][] = new Object[rowCount-1][columnCount];
		
		for(int i=1; i<=rowCount-1; i++){
			for(int j=0; j<=columnCount-1; j++){
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+"    ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}
}
