package com.infinite.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.infinite.pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_TestNG {

	private static WebDriver driver = null;

	@BeforeTest
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.iedriver().setup();
		//driver = new InternetExplorerDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\java_backend\\Selenium\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();*/
	}

	@Test
	public static void googlesearch() {

		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("infinite computer solutions");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);

	}

	@AfterTest
	public static void tearDownTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
		System.out.println("Test Completed TestNG 1 ");
	}

}