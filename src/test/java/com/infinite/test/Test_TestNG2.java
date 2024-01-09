package com.infinite.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.infinite.pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_TestNG2 {

	private static WebDriver driver = null;

	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public static void googlesearch2() {

		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("infinite computer solutions");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);

	}
	
	@Test
	public static void googlesearch3() {

		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("infinite computer solutions");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);

	}

	@AfterTest
	public static void closing() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
		System.out.println("Test Completed TestNG 2");
	}
}