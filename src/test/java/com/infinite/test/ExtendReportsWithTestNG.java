package com.infinite.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsWithTestNG {

	private static ExtentHtmlReporter htmlRepoter;
	private static ExtentReports extent;
	private static ExtentTest test;
	private static WebDriver driver = null;
	
	@BeforeSuite
	public void setUp() {
		htmlRepoter = new ExtentHtmlReporter("extentReport2.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlRepoter);
	}

	@BeforeTest
	public void driverSetup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		test = extent.createTest("Google Search Test1", "Google serech to validate");
		test.log(Status.INFO, "Starting Test Case");
	
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
	}
	
	@AfterTest
	public void closing(){
		driver.close();
		test.pass("Closed the Browser");
		
		System.out.println("Test COmpleted ");
		test.info("Test Completed");
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
