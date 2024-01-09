package com.infinite.priority;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.infinite.pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowser {

	private static WebDriver driver = null;
	
	@BeforeTest
	@Parameters("browserName")
	public void setup(String browserName){
		System.out.println("Browser Name"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("opera")){
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")){
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
		}
	}
	
	@Test
	public void test1() throws InterruptedException{
		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("infinite computer solutions");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.close();
		
	}


}
