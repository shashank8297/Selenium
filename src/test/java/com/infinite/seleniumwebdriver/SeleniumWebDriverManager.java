package com.infinite.seleniumwebdriver;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 	
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.id("APjFqb"));
		
		/*driver.get("https://www.youtube.com/");
		WebElement textbox = driver.findElement(By.id("search"));*/
		
		textbox.sendKeys("Selenium Framework for Beginners 5 drtcfvygubhi");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
