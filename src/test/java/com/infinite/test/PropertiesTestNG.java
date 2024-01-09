package com.infinite.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.infinite.config.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesTestNG {

	public static String browsername = null;

	public static void main(String[] args) {

		PropertiesFile.getProperties();
		if (browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
			driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
			driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
			driver.findElement(By.xpath("//*[@id='menu-1-03f366a']/li[2]/a")).click();
			//driver.findElement(By.linkText("Infinite Computer Solutions: Home")).click();
			//driver.findElement(By.xpath(xpathExpression));
		} else {
			
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();

			driver.get("https://www.google.com/");
			driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
			driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
			driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
