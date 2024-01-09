package com.infinite.priority;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infinite.pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250ms default
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.id("d6y7n")).click();
		
		driver.close();
		driver.quit();
	}
}
