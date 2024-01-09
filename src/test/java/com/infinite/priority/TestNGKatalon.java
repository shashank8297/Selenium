package com.infinite.priority;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TestNGKatalon {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private JavascriptExecutor js;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get(baseUrl + "chrome://newtab/");
		driver.get(
				"https://www.google.com/search?q=infinite+comuter+solution&rlz=1C1GCEU_enIN1073IN1073&oq=infinite+comuter+solution&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIVCAEQLhgNGIMBGMcBGLEDGNEDGIAEMgkIAhAAGA0YgAQyCQgDEAAYDRiABDIJCAQQABgNGIAEMg8IBRAuGA0YrwEYxwEYgAQyCQgGEAAYDRiABDIJCAcQABgNGIAEMgkICBAAGA0YgATSAQoxMTU4MWowajE1qAIAsAIA&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
		driver.get("https://www.infinite.com/");
		driver.findElement(By.xpath("//li[@id='menu-item-10995']/a/span[3]/span")).click();
		driver.findElement(By.xpath("//li[@id='menu-item-3294']/a/span[2]")).click();
		driver.findElement(By
				.xpath("//div[@id='page']/div[2]/section/div/div/div/section/div/div/div/div[2]/div/div/a/span/span/i"))
				.click();
		driver.findElement(By.id("input_1_1")).click();
		driver.findElement(By.id("input_1_1")).clear();
		driver.findElement(By.id("input_1_1")).sendKeys("shashank");
		driver.findElement(By.id("input_1_2")).clear();
		driver.findElement(By.id("input_1_2")).sendKeys("ahashank");
		driver.findElement(By.id("input_1_3")).clear();
		driver.findElement(By.id("input_1_3")).sendKeys("shashank@gmail.com");
		driver.findElement(By.id("input_1_4")).clear();
		driver.findElement(By.id("input_1_4")).sendKeys("ABCD");
		driver.findElement(By.id("input_1_10")).clear();
		driver.findElement(By.id("input_1_10")).sendKeys("1234567890");
		driver.findElement(By.id("input_1_6")).click();
		new Select(driver.findElement(By.id("input_1_6"))).selectByVisibleText("India");
		driver.findElement(By.id("input_1_7")).click();
		driver.findElement(By.id("input_1_7")).clear();
		driver.findElement(By.id("input_1_7")).sendKeys("xdgcfbhjklm");
		driver.findElement(By.xpath("//img[@alt='Infinite Computer Solutions']")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
