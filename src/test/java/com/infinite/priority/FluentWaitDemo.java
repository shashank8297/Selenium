package com.infinite.priority;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("infinite computer solutions");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver){
				WebElement linkele =  driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/div/span/a/h3"));
				if(linkele.isEnabled()){
					System.out.println("Element fouund:"+linkele);
				}
				return linkele;
			}
		});
		
		element.click();
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
}
