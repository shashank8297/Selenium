package com.infinite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement element = null;
	
	public static WebElement textboxsearch(WebDriver driver){
		element = driver.findElement(By.id("APjFqb"));
		return element;
	}
	
	public static WebElement searchbutton(WebDriver driver){
		element = driver.findElement(By.id("APjFqb"));
		return element;
	}
	
}
