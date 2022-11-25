package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,450)", "");
		Thread.sleep(5000);
		js.executeScript("window.scroll(0,-450)", "");
		Thread.sleep(5000);
		js.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		Thread.sleep(5000);
		js.executeScript("window.scroll(0,0)", "");
		driver.close();
		
	}
}
