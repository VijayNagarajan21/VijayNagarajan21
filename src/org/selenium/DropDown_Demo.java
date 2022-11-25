package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		findElement.click();
		Thread.sleep(5000);
		
	   WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	   findElement2.click();
	   Thread.sleep(2000);
	    
	   Select s=new Select(findElement2);
		s.selectByValue("21");
		Thread.sleep(5000);
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		findElement3.click();
		Thread.sleep(5000);
		
		Select s1=new Select(findElement3);
		s1.selectByVisibleText("Jun");
		
		
		WebElement findElement4 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		findElement4.click();
		Thread.sleep(5000);
		
		Select s2=new Select(findElement4);
		s2.selectByIndex(22);
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
