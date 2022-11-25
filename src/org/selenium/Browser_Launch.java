package org.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("vijayarcade3@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Vijay565");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@class=\"sqdOP  L3NKy   y3zKF     \"]"));
		login.click();
		Thread.sleep(5000);
		
        //String title = driver.getTitle();
		
		//System.out.println(title);
		
   		//String currentUrl = driver.getCurrentUrl();
		
		//System.out.println(currentUrl);
		
		//driver.navigate().to("https://twitter.com/");
		//Thread.sleep(2000);
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		
		//driver.navigate().forward();
		//Thread.sleep(2000); 
		
		//driver.close();
		//Thread.sleep(2000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Screenshot\\instagram.png");
		FileUtils.copyFile(s, d);
		
		Thread.sleep(5000);
		
		driver.close();
		Thread.sleep(5000);
	}
}
