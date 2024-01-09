package com.infinite.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.infinite.pages.GoogleSearchPage;
public class Test2_GoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
		GoogleSearchPage.textboxsearch(driver).sendKeys("infinite computer solutions");
		
		/*driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);*/
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		System.out.println("Test COmpleted ");
		
	}

}
