package com.infinite.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(capabilityName, value);*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		*/
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("A");
		

		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

}
