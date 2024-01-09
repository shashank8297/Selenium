package com.infinite.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportBasicReport {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// Start reporters
		ExtentHtmlReporter htmlRepoter = new ExtentHtmlReporter("extentReport.html");

		// create ExtentReport and attach reportes
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlRepoter);

		ExtentTest test = extent.createTest("Google Search Test1", "Google serech to validate");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		test.log(Status.INFO,"Starting Test Case");
		driver.get("https://www.google.com/");
		test.pass("Navgating to Google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
		test.pass("Entering the text in search box");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		test.pass("Pressing ENTER");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
		test.pass("Closed the Browser");
		System.out.println("Test COmpleted ");
		test.info("Test Completed");
		
		extent.flush();
	}
}
