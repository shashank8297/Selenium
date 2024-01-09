package com.infinite.test;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch(){
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
		/*driver.findElement(By.id("APjFqb")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		*/
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);

		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
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
