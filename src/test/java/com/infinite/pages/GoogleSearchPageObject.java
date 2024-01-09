package com.infinite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	By Search_box = By.id("APjFqb");
	By Search_button = By.name("btnk");

	public void GoogleSearchPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text){
		driver.findElement(Search_box).sendKeys(text);
	}
	
	public void clickSearchButton(){
		driver.findElement(Search_button).sendKeys(Keys.ESCAPE);
		driver.findElement(Search_button).sendKeys(Keys.ENTER);
	}
}
