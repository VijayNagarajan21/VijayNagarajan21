package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0fbtho20gmhn0l4xdi735u3t094897.node0");
		
		Thread.sleep(5000);
	//Simple Alert
		WebElement findElement = driver.findElement(By.id("j_idt88:j_idt91"));
		findElement.click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		Thread.sleep(5000);
	//Confirm Alert
		WebElement findElement2 = driver.findElement(By.id("j_idt88:j_idt93"));
		findElement2.click();
		Thread.sleep(5000);
		
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
		Thread.sleep(5000);
		
	//Prompt Alert
		//WebElement findElement3 = driver.findElement(By.id("j_idt88:j_idt104"));
		//findElement3.click();
		//Thread.sleep(5000);
		
		//Alert a2 = driver.switchTo().alert();
		//a2.sendKeys("VIJAY");
		//a2.accept();
		
		//Thread.sleep(5000);
		
		//WebElement findElement4 = driver.findElement(By.id("j_idt88:j_idt95"));
		//findElement4.click();
		//Thread.sleep(5000);
		//Alert a3 = driver.switchTo().alert();
		//a3.dismiss();
		
		Thread.sleep(5000);
		driver.close();
		
		}

}
