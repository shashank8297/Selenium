package com.infinite.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.infinite.pages.GoogleSearchPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_GoogleSearch {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	public static void googleSearch(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject();
		driver.get("https://www.google.co.in/");
		
		searchPageObject.setTextInSearchBox("shashank");
		
		searchPageObject.clickSearchButton();
		
		driver.close();
	}

}
