package com.infinite.listeners;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.infinite.pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGListenerDemo {

	private static WebDriver driver = null;

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("infinite computer solutions");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

	@Test
	public void test2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("Facebook");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

	@Test
	public void test3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		GoogleSearchPage.textboxsearch(driver).sendKeys("Youtube");
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ESCAPE);
		GoogleSearchPage.searchbutton(driver).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
